import java.util.*;

public class SearchProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Total no. of column: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // Input
        System.out.println("Enter the elemnts: ");
        // Rows
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
