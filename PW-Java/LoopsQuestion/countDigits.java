import java.util.*;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigit = 0;
        int original_n = n;

        while (n > 0) {
            n = n / 10;
            numOfDigit++;
        }

        System.out.println("No. of digits in " + original_n + "=" + numOfDigit);

    }
}