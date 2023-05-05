// Check the array is Sorted or not ? (in Strictly increasing order)

public class checkArraySorted {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5 };
        isSorted(arr, 0);
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        // if (arr[idx] < arr[idx + 1]) {
        // return isSorted(arr, idx + 1);
        // } else {
        // return false;
        // }
        // ---------OR-----------

        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1);
    }
}
