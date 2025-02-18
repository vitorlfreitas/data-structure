public class Tree {

    // Node
    private class Node {

        // Current value
        private int value;
        // Left leaf
        private Node leftChild;
        // Right leaf
        private Node rightChild;

        // Constructor
        public Node (int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }

    }

    private Node root;

    public void insert(int value) {

        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {

            if (value < current.value) {

                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;

            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {

        var current = root;

        while (current != null) {

            if (value == current.value)
                return true;

            if (value < current.value) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
        }

        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.value + ", ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {

        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value + ", ");
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {

        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + ", ");
    }
}
