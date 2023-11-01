// Given 2 numbers a and b. find a raise to the power b.

public class findPower {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int ans = 1;

        for (int i = 1; i <= 5; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
