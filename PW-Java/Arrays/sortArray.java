import java.util.*;

public class sortArray {

    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = smallestAndLargestElement(arr);

        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);
    }
}
