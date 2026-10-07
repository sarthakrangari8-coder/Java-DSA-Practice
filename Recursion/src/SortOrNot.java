import java.util.Scanner;

public class SortOrNot {
    static boolean fun(int[] arr, int i, int n) {
        if (i == n || i == n - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return fun(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int []arr={10,20,5};
        System.out.println(fun(arr,0, arr.length));
    }
}