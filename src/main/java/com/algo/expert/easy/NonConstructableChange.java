package com.algo.expert.easy;

import java.util.Arrays;

public class NonConstructableChange {

    public static int nonConstructibleChange(int[] coins){
        Arrays.sort(coins);
        int currentChangeCreated=0;
        for(int coin:coins){
            if(coin>currentChangeCreated+1){
                return currentChangeCreated+1;
            }
            currentChangeCreated=currentChangeCreated+coin;
            }
        return currentChangeCreated;
        }




    public static void main(String[] args) {
        int[] coins=new int[]{5,7,1,1,2,3,22};
      //  int[] coins=new int[]{1};
        int result=nonConstructibleChange(coins);
        System.out.println(result);
    }
}
