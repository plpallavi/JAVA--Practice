public class StringFunction {
    public static void main(String args[]) {
        // concatination
        String firstName = "Pallavi";
        String lastName = "Kumari";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
