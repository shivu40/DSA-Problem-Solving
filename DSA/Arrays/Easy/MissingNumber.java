package DSA.Arrays.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int ans = -1;
//         for(int i = 0; i < nums.length; i++){
//             if(i != nums[i]){
//                 ans = i;
//                 break;
//             }
//         }

//         if(ans == -1){
//             return nums.length;
//         }else{
//             return ans;
//         }

        //Second Approach:
        // Time Complexity: O(n)
        // Space Complexity: O(1).


        // int n = nums.length;
        // long totalSum = (n * (n + 1)) / 2;
        // long sum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        // }

        // return (int)totalSum - (int)sum;


        //Most Optimal Approach: (XOR):
        // Time Complexity: O(n)
        // Space Complexity: O(1).
        int xor1 = 0;
        for(int i = 1; i <= nums.length; i++){
            xor1 = xor1 ^ i;
        }

        int xor2 = 0;
        for(int i = 0; i < nums.length; i++){
            xor2 = xor2 ^ nums[i];
        }

        return xor1 ^ xor2;

    }
}
