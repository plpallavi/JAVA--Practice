public class accessModifier {
    public String str_1 = "I am a public member";

    void printFromClass() {
        System.out.println("within class: " + str_1);
    }

    public static void main(String[] args) {
        accessModifier obj = new accessModifier();
        obj.printFromClass();
        System.out.println(obj.str_1);
    }
}
