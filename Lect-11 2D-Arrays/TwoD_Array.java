import java.util.*;

public class TwoD_Array {
    public static void main(String args[]) {

        // Declaration of 2D Array
        // type[][] arrayName = new type[rows][column];

        Scanner sc = new Scanner(System.in);
        System.out.print("Total no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Total no. of column: ");
        int cols = sc.nextInt();

        int[][] nums = new int[rows][cols];

        // Input
        System.out.println("Enter the elemnts: ");
        // Rows
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        // Output
        System.out.println("Required Array is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}