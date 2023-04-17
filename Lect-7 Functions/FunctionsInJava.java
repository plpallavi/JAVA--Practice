import java.util.*;

public class FunctionsInJava {
    // Declaration of Function
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        // Calling the function
        printMyName("Pallavi");
        System.out.print("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }

}