import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int
            key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 100;
        System.out.println(linearSearch(arr, key));
    }
}