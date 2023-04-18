import java.util.*;

public class InputInArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            num[i] = sc.nextInt();
        }
        // Output
        System.out.print("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
