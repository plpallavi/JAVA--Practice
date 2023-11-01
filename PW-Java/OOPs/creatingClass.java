class Person {
    String Name;
    int rollNumber;
    int age = 15;
}

public class creatingClass {

    public static void main(String[] args) {

        // Creating an Object
        // ClassName ObjectName = new ClassName();

        Person p1 = new Person();
        p1.Name = "Pallavi";
        p1.rollNumber = 68;
        System.out.println(p1.Name);
        System.out.println(p1.rollNumber);
        System.out.println(p1.age);

        Person p2 = new Person();
        p2.Name = "Saloni";
        p2.rollNumber = 10;
        System.out.println(p2.Name);
        System.out.println(p2.rollNumber);
    }
}
