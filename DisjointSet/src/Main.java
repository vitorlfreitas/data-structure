import dsu_implementation.Dsu;
import dsu_implementation.SimpleDsu;
import dsu_implementation.UnionByRank;

/**
 * Java program to test the DSU implementations
 */
public class Main {

    public static void main(String[] args) {

        SimpleDsu sdsu = new SimpleDsu(5);

        System.out.println(sdsu.find(0) + " " + sdsu.find(2));
        // Output: 0 2

        // Union 2 subsets
        sdsu.union(0, 2);

        System.out.println(sdsu.find(0) + " " + sdsu.find(2));
        // Output: 0 0

        System.out.println();

        UnionByRank ur = new UnionByRank(5);

        System.out.println(ur.find(0) + " " + ur.find(2));
        // Output: 0 2

        // Union 2 subsets
        ur.union(0, 2);

        System.out.println(ur.find(0) + " " + ur.find(2));
        // Output: 2 2

        System.out.println();

        // Declares a new instance of DSU
        Dsu dsu = new Dsu(5);

        // Prints parent initialized as each element as itw own distinct set
        System.out.print("[ ");
        for (int i : dsu.getParent()) {
            System.out.print(i + ", ");
        }
        System.out.println("]");

        System.out.println(dsu.find(0) + " " + dsu.find(2));
        // Output: 0 2

        // Union 2 subsets
        dsu.union(0, 2);

        System.out.println(dsu.find(0) + " " + dsu.find(2));
        // Output: 0 0

        System.out.print("[ ");
        for (int i : dsu.getParent()) {
            System.out.print(i + ", ");
        }
        System.out.println("]");

        dsu.union(2, 4);
        dsu.union(4, 3);

        System.out.print("[ ");
        for (int i : dsu.getParent()) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        // [ 2, 1, 2, 2, 2, ]
        // Which is: [{2, 2, 2, 2},{1}]



    }
}
