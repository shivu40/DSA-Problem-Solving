package DSA.Sorting;

public class BubbleSort {
//    Push the maximum to the last by adjacent swaps:
//    Max element go to the last just like bubble popping up:
//    Time Complexity: O(n^2)
//    Space Complexity: O(1)
    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
