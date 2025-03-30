import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int
            left, int right, int key)
    {
        if (right>= left)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[mid] > key)
            {
                return binarySearch(arr, left, mid - 1,
                        key);
            }
            return binarySearch(arr, mid + 1, right,
                    key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {100, 20, 30, 50, 40, 60, 70, 80, 90, 10};
        int key = 100;
        Arrays.sort(arr);
        System.out.println("Binary Search: " +
                binarySearch(arr, 0, arr.length-1, key));
    }
}