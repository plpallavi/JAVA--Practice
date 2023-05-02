import java.util.*;

public class Bits {
    public static void main(String[] args) {
        // Get bit
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        // Set bit
        int x = 5;
        int posi = 1;
        int bitMask1 = 1 << posi;

        int newNumber = bitMask1 | x;
        System.out.println(newNumber);

        // Clear bit
        int y = 5;
        int posit = 2;
        int bitMask2 = 1 << posit;
        int notBitMask2 = ~(bitMask2);

        int newNumber1 = notBitMask2 & y;
        System.out.println(newNumber1);

        // Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int z = 5;
        int position = 1;

        int bitMask3 = 1 << position;
        if (oper == 1) {
            int newNumber2 = bitMask3 | z;
            System.out.println(newNumber2);
        } else {
            int newBitMask = ~(bitMask3);
            int newNumber4 = newBitMask & z;
            System.out.println(newNumber4);

        }
    }
}
