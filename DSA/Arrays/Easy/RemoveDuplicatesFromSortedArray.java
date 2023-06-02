package DSA.Arrays.Easy;

import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

    // Brute Force: put all elements in Treeset then replace the array elements. -> TC = O(nlogn), SC = O(n)
    //Optimal: Use Two Pointer approach: TC = O(n) SC = O(1).
    public int removeDuplicates(int[] nums) {
        // Brute Force:

//        TreeSet<Integer> treeSet = new TreeSet<>();
//
//        for(int i = 0; i < nums.length; i++)
//        {
//            treeSet.add(nums[i]);
//        }
//        System.out.println(treeSet);
//        int i = 0;
//        while(treeSet.size() > 0){
//            nums[i++] = treeSet.pollFirst();
//        }
//
//        return i;

        //Optimal:
         int i = 0;
         int j = 1;

         while(j < nums.length){
             if(nums[i] == nums[j]){
                 j++;
             }else{
                 i++;
                 nums[i] = nums[j];
                 j++;
             }
         }

         return i + 1;
    }
}
