class InsertBST {
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

    public static Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if(data < root.data) {
            root.left = insert(root.left, data);
            return root;
        } else {
            root.right = insert(root.right, data);
            return root;
        }
    } 

    public static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node n = new Node(5);
        inOrder(insert(n, 4));
        System.out.println();
    }
}