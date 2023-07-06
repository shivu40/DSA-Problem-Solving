package DSA.BinarySearch.oneDArray;

public class FirstAndLastPositionOfElementInSortedArray {
    public static int firstIndex(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int result = -1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                result = mid;
                end = mid - 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }
        }

        return result;
    }

    public static int lastIndex(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int result = -1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                result = mid;
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }
        }

        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);
        return result;
    }
}
