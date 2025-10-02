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

    /**
     * Inserts a value into the tree.
     * @param value the value to be inserted
     */
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

    /**
     * Finds a value in the tree.
     * @param value the value to be found
     * @return true if the value is found, false otherwise
     */
    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value == current.value)
                return true;

            if (value < current.value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }

        return false;
    }

    /**
     * Traverses the tree in pre-order and prints the values.
     */
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

    /**
     * Traverses the tree in in-order and prints the values.
     */
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

    /**
     * Traverses the tree in post-order and prints the values.
     */
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

    /**
     * Calculates the height of the tree.
     * @return the height of the tree
     */
    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    /**
     * Finds the minimum value in the tree.
     * @return the minimum value in the tree
     */
    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    /**
     * Checks if this tree is equal to another tree.
     * @param other the other tree to compare with
     * @return true if the trees are equal, false otherwise
     */
    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    /**
     * Checks if the tree is a binary search tree.
     * @return true if the tree is a binary search tree, false otherwise
     */
    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value < min || root.value > max)
            return false;

        return isBinarySearchTree(root.leftChild, min, root.value - 1)
                && isBinarySearchTree(root.rightChild, root.value + 1, max);
    }
}