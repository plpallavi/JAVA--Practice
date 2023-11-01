// Find the total number of pairs in the Array whose is equal to the given value x.

import java.util.*;

public class targetSum {

    static int findTargetSum(int[] arr, int x) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // for first number
            for (int j = i + 1; j < n; j++) { // for second number
                if (arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
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

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.println(findTargetSum(arr, x));
    }
}
