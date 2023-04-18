import java.util.*;

public class SearchNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the search element: ");
        int x = sc.nextInt();

        // Output
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.print("X found at index: " + i);
            }
        }
    }
}
