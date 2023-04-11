import java.util.*;

public class CondittionQus1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();

        if (x % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
