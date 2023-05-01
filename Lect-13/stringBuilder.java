public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Pallavi" + " ");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // Insert function
        sb.insert(1, 'P');
        System.out.println(sb);

        // Delete the extra n
        sb.delete(0, 1);
        System.out.println(sb);

        // Append function
        sb.append('K');
        sb.append('u');
        sb.append('m');
        sb.append('a');
        sb.append('r');
        sb.append('i');
        System.out.println(sb);

        // Length function
        System.out.println(sb.length());

    }

}