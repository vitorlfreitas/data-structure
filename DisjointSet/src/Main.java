import dsu_implementation.SimpleDsu;

/**
 * Java program to test the DSU implementations
 */
public class Main {

    public static void main(String[] args) {

        SimpleDsu dsu = new SimpleDsu(5);

        System.out.println(dsu.find(2));
        // Output: 2

        // Union 2 subsets
        dsu.union(0, 2);

        System.out.println(dsu.find(2));
        // Output: 0


    }
}
