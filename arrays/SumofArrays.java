package arrays;

public class SumofArrays {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 10, 3, 5, 9, 21, 1 }; // array

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum of Arrays
        }
        System.out.println("Sum of Elements: " + sum); // 49
    }
}
