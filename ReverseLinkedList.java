class ReverseLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
            this.next = null;
        } 

        public void setNext(Node n) {
            this.next = n;
        }
    }

    public void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    } 

    public Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        ReverseLinkedList r = new ReverseLinkedList();
        r.printLinkedList(n1);
        n1 = r.reverse(n1);
        r.printLinkedList(n1);
    }
}