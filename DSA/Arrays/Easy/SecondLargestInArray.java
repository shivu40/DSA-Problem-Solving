package DSA.Arrays.Easy;

public class SecondLargestInArray {
    //Brute force : Sort the array.
    //Better: Two pass method (find largest then second largest in different passes(loops)).
    //Optimal: ONe pass method. -> time complexity: O(n)

    int print2largest(int arr[], int n) {
        int largest = arr[0];
        int secondLargest = -1;

        //Most Optimal one pass method:
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
