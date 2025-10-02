package dsu_implementation;

/**
 * A simple implementation of the Disjoint Set (Union-Find) Data Structure
 */
public class UnionByRank {

    private final int[] parent;
    private final int[] rank;

    public UnionByRank(int size) {

        // Initialize the array with length = size
        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            // Define all set as its own subset
            parent[i] = i;
            rank[i] = 1;
        }
    }

    /**
     * Find the root parent of x
     * @param x the set to be found
     * @return the parent of the node
     */
    public int find(int x) {

        if (parent[x] == x)
            return x;

        else
            return find(parent[x]);

    }

    public void union(int x, int y) {

        int rootX = this.find(x);
        int rootY = this.find(y);

        // If rootX and rootY are from same set already, "DO NOTHING"
        if (rootX == rootY)
            return;

        // Union by rank
        // Attach the smaller rank tree under the root of the higher rank tree
        if (rank[rootX] < rank[rootY])
            parent[rootX] = rootY;

        else if (rank[rootX] > rank[rootY])
            parent[rootY] = rootX;
        // If ranks are same, then make one as root of another and increment its rank by one
        else {
            parent[rootX] = rootY;
            rank[rootY] += 1;
        }
    }

    public int[] getParent() {
        return parent;
    }


}