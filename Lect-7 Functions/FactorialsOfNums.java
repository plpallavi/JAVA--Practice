import java.util.*;

public class FactorialsOfNums {

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Number Invalid!!!");
            System.out.println("Enter a Valid Number");
            return;
        }

        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println(fact);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        factorial(n);

    }

}
