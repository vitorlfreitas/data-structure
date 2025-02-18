
package array;

public class Array {
    
    private int[] items;
    private int count = 0;

    public Array(int length) {
        
        this.items = new int[length];
        
    }
    
    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            
            items = newItems;

        }
        items[count++] = item;
    }
    
    public void print() {
        for (int i = 0; i < count; i++) {
            
            System.out.print(items[i] + " ");
        
        }
    }
    
    
}
