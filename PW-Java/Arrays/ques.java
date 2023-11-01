class arrayQues {

    // Sum of the elements in the given array.
    void sumOfArrays() {
        int[] arr = { 7, 8, 9 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // Find the largest no. in the array
    void maxArrays() {
        int[] arr = { 15, 4, 8, 6, 23 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    // Search the element in the array
    // Linear Search

    void search() {
        int[] arr1 = { 10, 24, 56, 78, 45, 76, 10 };

        int x = 6;
        int ans = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(ans);
        }

    }
}

public class ques {
    public static void main(String[] args) {
        arrayQues obj = new arrayQues();
        // obj.sumOfArrays();
        // obj.maxArrays();
        obj.search();
    }
}
