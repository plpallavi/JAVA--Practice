//Time Complexity O(2^n-1) i.e almost equal to O(2^n)

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 2;
        toh(n, "S", "H", "D");
    }

    public static void toh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        toh(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        toh(n - 1, helper, src, dest);
    }
}