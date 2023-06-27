package DSA.Arrays.Medium;

public class RearrangeArrayElementsBySign {
    // public int[] rearrangeArray(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];

    //     int pos = 0;
    //     int neg = 0;
    //     int ansIndex = 0;
    //     while(ansIndex < n){
    //         while(pos < n && nums[pos] < 0){
    //             pos++;
    //         }

    //         ans[ansIndex++] = nums[pos++];

    //         while(neg < n && nums[neg] > 0){
    //             neg++;
    //         }
    //         ans[ansIndex++] = nums[neg++];
    //     }

    //     return ans;
    // }

    // Brute Force: Take two arrays, one for positive and other for negative numbers. Then transfer them alternatively to the answer array.

    // Optimal: Intuition: since we have to arrange pos and neg alternate and both are equal so positive will be on even indexes and negative will be on odd indexes.
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[neg] = nums[i];
                neg += 2;
            }else{
                ans[pos] = nums[i];
                pos += 2;
            }
        }

        return ans;
    }
}
