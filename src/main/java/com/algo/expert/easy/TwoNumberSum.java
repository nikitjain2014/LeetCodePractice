package com.algo.expert.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    public static int[] twoNumberSumSol2(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<Integer>();
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if(nums.contains(potentialMatch)){
                return new int[] {potentialMatch,num};
        }
            else{
            nums.add(num);
            }
        }
            return new int[0];
    }
    public static int[] twoNumberSumSol1(int[] array, int targetSum) {
        // Write your code here.
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((i!=j) && (array[i]+array[j]==targetSum)){
                    return new int[]{array[i],array[j]};
                }
            }

        }
     return null;
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 5, -4, 8, 11, 1, 6};
        int[] result1 = twoNumberSumSol1(inputArr, 8);
        int[] result2 = twoNumberSumSol2(inputArr, 8);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));

    }
}
