import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int[] marks = new int[3];
        marks[0] = 98; // phy
        marks[1] = 96; // chem
        marks[2] = 97; // maths

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}