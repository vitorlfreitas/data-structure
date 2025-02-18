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