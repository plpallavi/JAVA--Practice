import java.util.*;

public class ConditionQus2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        int b = sc2.nextInt();

        if (a == b) {
            System.out.println("a is Equal to b");
        } else if (a > b) {
            System.out.println("a is Greater than b ");
        } else {
            System.out.println("a is less than b");
        }

    }
}
