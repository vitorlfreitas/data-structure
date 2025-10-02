public class Main {
    public static void main(String[] args) {

        // Initialing
        Tree tree = new Tree();

        // Populating Our Tree
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(14);
        tree.insert(24);
        tree.insert(3);
        tree.insert(8);
        tree.insert(26);


//        Finding a Number
//        System.out.println(tree.find(11));

//        System.out.println(getFactorial(14));
//        System.out.println(getFactorial(0));
//        System.out.println(getFactorial(1));

        System.out.println("Depth First: ");
        System.out.print("\t- In Order: ");
        tree.traverseInOrder();

        System.out.println();

        System.out.print("\t- Pre Order: ");
        tree.traversePreOrder();


        System.out.println();

        System.out.print("\t- Post Order: ");
        tree.traversePostOrder();

        System.out.println();

        System.out.println("Height of the Tree: " + tree.height());

        System.out.println("Min value of the Tree: " + tree.min());

        // Initiating a second tree
        Tree secondTree = new Tree();

        // Populating Our Second Tree
        secondTree.insert(20);
        secondTree.insert(10);
        secondTree.insert(30);
        secondTree.insert(6);
        secondTree.insert(14);
        secondTree.insert(24);
        secondTree.insert(3);
        secondTree.insert(8);
        secondTree.insert(26);

        System.out.println("They are equal: " + tree.equals(secondTree));

        // Checking if the Tree is a Binary Search Tree
        System.out.println("Tree is a Binary Search Tree: " + tree.isBinarySearchTree());

        tree.insert(19);

        // Checking if the Tree is a Binary Search Tree after a insertion
        System.out.println("Tree is a Binary Search Tree: " + tree.isBinarySearchTree());



    }

    // Explaining Recursive
    public static int getFactorial(int n) {

        if (n == 0)
            return 1;

        if (n == 1)
            return n;

        return n * getFactorial(n - 1);
    }
}