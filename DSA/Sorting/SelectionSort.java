package DSA.Sorting;



public class SelectionSort {
//    Selection sort working principle: Select minimum and swap (Ascending order).
//    We find the minimum element and swap it with the first element, then
//    since the first element is sorted we again find the minimum for rest of the array and swap it with
//    the second element, then again from 3rd element to last element find minimum and swap it with 3rd element
//    and so on.....
//    Time Complexity : O(n^2)
//    Space Complexity: O(1)
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 2; i++){
            //It will run till n-2 index because last element remaining will always be sorted.

            int miniIndex = i;  //Initially considering minimum as the ith index

            for(int j = i; j < n; j++){
                if(arr[j] < arr[miniIndex])
                    miniIndex = j;
            }

            //Swap minimum element and element at ith index:
            swap(arr, miniIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
