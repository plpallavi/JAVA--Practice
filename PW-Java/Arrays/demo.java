class ArraysExample {
    void demoArrays() {
        int[] ages = new int[3];
        String[] names = { "Pallavi", "Saloni", "Nishant", "Samrat" };
        ages[0] = 23;
        ages[1] = 21;
        ages[2] = 24;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println(ages.length);
        System.out.println(names.length);

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }

        // for each loop
        for (int age : ages) {
            System.out.println(age);
        }

        // While Loop

        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            i++;
        }
    }

    void multiArrays() {
        // int[][] arr1 = new int[3][4];
        int[][] arr = { { 12, 23, 34 }, { 13, 24, 25 }, { 21, 87, 89 }, { 12, 45, 78
        } };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
}

public class demo {
    public static void main(String[] args) {

        ArraysExample arr = new ArraysExample();
        arr.demoArrays();
        arr.multiArrays();
    }
}