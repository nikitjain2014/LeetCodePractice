package com.algo.expert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {

    public static boolean isValidSubsequenceSol1(int[] array, int[] sequence) {
        int seqIdx = 0;
     for(int num : array) {
         if(seqIdx == sequence.length) break;
         if(num == sequence[seqIdx]) seqIdx++;
     }
     return seqIdx == sequence.length;
    }

    public static boolean isValidSubsequenceSol2(List<Integer> array,List<Integer> sequence){
        int seqIdx=0;
        for(int i=0;i<array.size();i++){
            if(seqIdx==sequence.size()) break;
            if(array.get(i)==sequence.get(seqIdx)) seqIdx++;
         }
         return seqIdx==sequence.size();
        }

    public static void main(String[] args) {
        List<Integer> array2=new ArrayList<Integer>(Arrays.asList(1,1,6,1));
        List<Integer> sequence2=new ArrayList<Integer>(Arrays.asList(1,1,1));
        int[] array=new int[]{1,1,6,1};
        int[] sequence=new int[]{1,1,1};
        boolean result=isValidSubsequenceSol1(array,sequence);
        boolean result2=isValidSubsequenceSol2(array2,sequence2);
        System.out.println(result);
        System.out.println(result2);

    }
}
