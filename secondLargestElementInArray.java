import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1; // Edge case
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        System.out.println("Second largest: " + secondLargest(arr));
    }
}
