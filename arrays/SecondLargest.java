package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int max1 = 0; // initialization
        int max2 = 0;
        int[] arr = { 69, 72, 45, 65, 2 }; // array
        if (arr[0] > arr[1]) { // checking element 0 is Greater than element 1
            max1 = arr[0];
            max2 = arr[1];
        } else if (arr[0] < arr[1]) {
            max2 = arr[0];
            max1 = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        // printing output
        System.out.println("Largest Element: " + max1);
        System.out.println("Second Largest Element: " + max2);
    }
}
