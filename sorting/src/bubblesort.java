import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // passes
            for (int j = 0; j < arr.length - i - 1; j++) { // compare adjacent
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
