package DSA.Arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayWithSumK {

    // Brute Force: : Will Work for positive, negative as well as zeroes
    // Time Complexity: O(n^2);
    // Space Complexity: O(1);
//    public static int getLongestSubarray(int []a, long k) {
//        int n = a.length; // size of the array.
//
//        int len = 0;
//        for (int i = 0; i < n; i++) { // starting index
//            long s = 0; // Sum variable
//            for (int j = i; j < n; j++) { // ending index
//                // add the current element to
//                // the subarray a[i...j-1]:
//                s += a[j];
//
//                if (s == k)
//                    len = Math.max(len, j - i + 1);
//            }
//        }
//        return len;
//    }

    // Better Solution: Will Work for positive, negative as well as zeroes
    // Time Complexity: O(n);
    // Space Complexity: O(n);
//    public static int getLongestSubarray (int A[], int N, int K) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//        map.put(sum, -1);
//
//        int ans = 0;
//
//        for(int i = 0; i < N; i++){
//            sum += A[i];
//            if(map.containsKey(sum - K)){
//                int idx = map.get(sum - K);
//                ans = Math.max(ans, i - idx);
//            }
//            if(map.containsKey(sum) == false){
//                map.put(sum, i);
//            }
//
//        }
//
//        return  ans;
//    }

    // Optimal Solution: Will Work for positive,and zeroes, will not work for negatives.
    // Time Complexity: O(2n);
    // Space Complexity: O(1);
    public static int getLongestSubarray (int A[], int N, int K) {
       int left = 0;
       int right = 0;
       int sum = A[0];
       int maxLen = 0;
       while(right < N){
           while(left < N && sum > K){
               sum -= A[left];
           }

           if(sum == K){
               int len = right - left + 1;
               maxLen = Math.max(maxLen, len);
           }

           right++;
           if(right < N)
               sum += A[right];
       }

       return maxLen;
    }
}
