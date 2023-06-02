package DSA.Arrays.Easy;

public class LargestElementInArray {
//  Brute Force: Sort the array -> Time Complexity : O(nlogn)
//  optimal : Keep a max variable then Traverse the array and update max variable -> Time Complexity: O(n)

    public int largest(int arr[], int n)
    {
        // Optimal:
        int max = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
