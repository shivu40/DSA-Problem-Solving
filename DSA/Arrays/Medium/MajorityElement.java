package DSA.Arrays.Medium;

public class MajorityElement {
//    Brute Force:
//    For every element count the frequency using O(n) loop. If it is majority then return it.
//
//    Time Complexity: O(n^2)
//    Space Complexity: O(1).
//
//    Better:
//    For counting the frequencies use hashamap.
//
//    Time Complexity: O(n)
//    Space Complexity: O(n).
//
//    optimal:
//    Use moore's voting algorithm.
//
//    Time Complexity: O(n)
//    Space Complexity: O(1).
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int candidate = -1;

        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                candidate = nums[i];
            }else if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
}
