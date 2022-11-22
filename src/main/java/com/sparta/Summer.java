package com.sparta;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1, 2, 3, 4, 5};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));
    }
    public int sumArray(int[] theInts){
        int result = 0;
        for(int i = 0; i<theInts.length; i++) {
            result = result + theInts[i];
        }
        return result;
    }
}