public class printNum {
    public static void main(String[] args) {
        int n = 5;
        // int n = 1;
        printNum(n);
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);

        // if (n == 6) {
        // return;
        // }
        // System.out.println(n);
        // printNum(n + 1);
    }
}