import java.util.*;

class Add {
    static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }

}

public class sumOfTwoNum {
    public static void main(String[] args) {

        Add s = new Add();

        System.out.print("Enter 1st num: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();

        System.out.print("Sum of a+ b: ");
        int ans = s.sum(a, b);
        System.out.println(ans);
    }

}