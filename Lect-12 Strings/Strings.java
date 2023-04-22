import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Declaration of String
        String name = "Pallavi";
        String fullName = "Pallavi Kumari";
        String sentence = "Hii!!...My name is Pallavi";
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(sentence);

        // Taking input from users

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String yourName = sc.next();
        System.out.println("Your name:" + yourName);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your Full name: ");
        String yourFullName = in.nextLine();
        System.out.println("Your full name: " + yourFullName);
    }
}