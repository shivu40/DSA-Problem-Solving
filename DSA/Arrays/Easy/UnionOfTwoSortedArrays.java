package DSA.Arrays.Easy;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    // Brute Force: Using Treeset
    // Time Complexity: O((n+m) * log(n+m))
    // Space Complexity: O(n + m)
    // public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    // {


    //     TreeSet<Integer> treeSet = new TreeSet<>();
    //     ArrayList<Integer> result = new ArrayList<>();

    //     for(int i = 0; i < arr1.length; i++){
    //         treeSet.add(arr1[i]);
    //     }

    //     for(int i = 0; i < arr2.length; i++){
    //         treeSet.add(arr2[i]);
    //     }

    //     for(Integer val : treeSet){
    //         result.add(val);
    //     }

    //     return result;
    // }

    // Optimal: Using Two Pointer
    // Time Complexity: O(n+m)
    // Space Complexity: O(n + m)(if union arraylist space is considered) otherwise O(1).
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if( union.size() == 0 || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if( union.size() == 0 || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < arr1.length){
            if( union.size() == 0 || union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if( union.size() == 0 || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
