public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int sumN = n * (n + 1) / 2;
        int sumArr = 0;
        for (int num : arr) {
            sumArr += num;
        }
        return sumN - sumArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("Missing number: " + findMissing(arr, n));
    }
}
