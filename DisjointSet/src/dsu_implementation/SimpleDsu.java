package dsu_implementation;

/**
 * A simple implementation of the Disjoint Set (Union-Find) Data Structure
 */
public class SimpleDsu {

    // Public to facilitate the studies
    private final int[] parent;
    private int size;

    public SimpleDsu(int size) {

        // Initialize the array with length = size
        parent = new int[size];

        for (int i = 0; i < size; i++) {
            // Define all set as its own subset
            parent[i] = i;
        }
    }

    /**
     * Find the root parent of x
     * @param x the set to be found
     * @return the parent of the node
     */
    public int find(int x) {

        if (this.parent[x] == x)
            return x;

        else
            return this.find(parent[x]);

    }

    public void union(int x, int y) {

        int rootX = this.find(x);
        int rootY = this.find(y);

        // If rootX and rootY are from same set already, "DO NOTHING"
        if (rootX == rootY)
            return;

        this.parent[rootY] = rootX;
    }

    public int[] getParent() {
        return parent;
    }


}