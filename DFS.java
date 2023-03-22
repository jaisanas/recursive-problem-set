import java.util.*;

class DFS {
    static class Node {
        int data;
        List<Node> neighbors;

        Node(int data) {
            this.data = data;
            this.neighbors = new ArrayList<>();
        }
    }

    public static boolean search(Node n, Set<Node> visited, int data) {
        if(n == null) {
            return false;
        }

        if(n.data == data) {
            return true;
        }

        for(Node neighbor: n.neighbors) {
            if(visited.contains(neighbor)) continue;
            visited.add(neighbor);
            boolean isFound = search(neighbor, visited, data);
            if(isFound) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        List<Node> neighbors1 = new ArrayList<>();
        neighbors1.add(n1);
        neighbors1.add(n2);
        n.neighbors = neighbors1;
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        List<Node> neighbors2 = new ArrayList<>();
        neighbors2.add(n3);
        neighbors2.add(n4);
        n2.neighbors = neighbors2;
        System.out.println(search(n, new HashSet<>(), 6));
    }
}