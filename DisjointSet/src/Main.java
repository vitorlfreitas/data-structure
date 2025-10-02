import dsu_implementation.SimpleDsu;
import dsu_implementation.UnionByRank;

/**
 * Java program to test the DSU implementations
 */
public class Main {

    public static void main(String[] args) {

        SimpleDsu dsu = new SimpleDsu(5);

        System.out.println(dsu.find(0) + " " + dsu.find(2));
        // Output: 0 2

        // Union 2 subsets
        dsu.union(0, 2);

        System.out.println(dsu.find(0) + " " + dsu.find(2));
        // Output: 0 0

        System.out.println();

        UnionByRank ur = new UnionByRank(5);

        System.out.println(ur.find(0) + " " + ur.find(2));
        // Output: 0 2

        // Union 2 subsets
        ur.union(0, 2);

        System.out.println(ur.find(0) + " " + ur.find(2));
        // Output: 2 2


    }
}
