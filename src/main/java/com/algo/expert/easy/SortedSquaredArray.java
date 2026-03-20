package com.algo.expert.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArraySol1(int[] array){
        int[] sortedSquaredArray=new int[array.length];
        for(int i=0;i<array.length;i++){
                int squareNum=array[i]*array[i];
            sortedSquaredArray[i]=squareNum;
        }
        Arrays.sort(sortedSquaredArray);
        return sortedSquaredArray;
    }

    public static int[] sortedSquaredArraySol2(int[] array){
        int[] sortedSquaredArray=new int[array.length];
         int smallerValueIdx=0;
         int largerValueIdx=array.length-1;

         for(int idx=array.length-1;idx>=0;idx--){
             int smallerValue= array[smallerValueIdx];
             int largerValue= array[largerValueIdx];

         if(Math.abs(smallerValue)>Math.abs(largerValue)){
                sortedSquaredArray[idx]=smallerValue*smallerValue;
                smallerValueIdx++;
         }else{
                sortedSquaredArray[idx]=largerValue*largerValue;
                largerValueIdx--;
         }
         }

        return sortedSquaredArray;
    }


    public static void main(String[] args) {
        int[] array=new int[]{-7,-3,1,4,8};
        int[] result=sortedSquaredArraySol1(array);
        System.out.println(Arrays.toString(result));

        int[] array2=new int[]{-5,-3,1,4,8};
        int[] result2=sortedSquaredArraySol1(array2);
        System.out.println(Arrays.toString(result2));
    }
}
