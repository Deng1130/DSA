import java.util.Arrays;

public class CustomArrayList {
    private int[] arr = new int[10];
    private int size = 0;
    private void resize() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
    public void insert(int val) {
        if (size == arr.length) resize();
        arr[size++] = val;
    }
    public void insertAt(int index, int val) {
        if (index < 0 || index > size)
            return;
        if (size == arr.length) resize();
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = val;
        size++;
    }
    public void remove() {
        if (size > 0)
            size--;
    }
    public void removeAt(int index) {
        if (index >= 0 && index < size)
            System.arraycopy(arr, index + 1, arr, index, --size - index);
    }
    public void removeElement(int val) {
        removeAt(find(val));
    }

    public int get(int index) {
        return (index >= 0 && index < size) ? arr[index] : -1;
    }
    public void set(int index, int val) {
        if (index >= 0 && index < size) arr[index] = val;
    }
    public int find(int val) {
        for (int i = 0; i < size; i++)
            if (arr[i] == val) return i;
        return -1;
    }
    public boolean contains(int val) {
        return find(val) != -1;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public int[] toArray() {
        return Arrays.copyOf(arr, size);
    }
    public void display() {
        System.out.println(Arrays.toString(Arrays.copyOf(arr, size)));
    }
}
