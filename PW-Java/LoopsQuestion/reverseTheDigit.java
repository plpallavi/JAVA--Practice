import java.util.*;

public class reverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = sc.nextInt();
        int ans = 0;

        while (i > 0) {
            ans = ans * 10 + i % 10;
            i /= 10;
        }
        System.out.println("Reversed answer is : " + ans);
    }
}
