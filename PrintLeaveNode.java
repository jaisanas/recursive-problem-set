class PrintLeaveNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void print(Node n) {
        if(n == null) {
            return;
        }

        if(n.left == null && n.right == null) {
            System.out.print(n.data+", ");
            return;
        }

        print(n.left);
        print(n.right);
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        n.left = n1;
        n.right = n2;

        print(n);
    }
}