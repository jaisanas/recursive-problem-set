class MergedSortedLiskedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node n1, Node n2) {
        if(n1 == null) return n2;
        if(n2 == null) return n1;

        if(n1.data < n2.data) {
            n1.next = merge(n1.next, n2);
            return n1;
        } else {
            n2.next = merge(n1, n2.next);
            return n2;
        }
    }

    public static void print(Node n) {
        if(n != null) {
            System.out.print(n.data+" ");
            print(n.next);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        n1.next = n2;
        n2.next = n3;

        Node m1 = new Node(2);
        Node m2 = new Node(4);
        Node m3 = new Node(6);
        m1.next = m2;
        m2.next = m3;

        print(merge(n1,m1));
    }
}