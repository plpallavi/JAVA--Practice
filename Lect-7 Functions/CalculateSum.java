import java.util.*;

public class CalculateSum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 2: ");

        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("Sum: ");

        System.out.println(sum);
    }
}
