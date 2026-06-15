package arrays;

public class MinandMax {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 56, 7, 88, 9, 221 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

    }
}
