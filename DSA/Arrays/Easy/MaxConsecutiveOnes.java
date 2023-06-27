package DSA.Arrays.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }

        return max;
    }
}
