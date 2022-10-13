package com.harshit;
import java.util.Arrays;

public class PassingFunction {
    public static void main(String [] args){
        int [] arr={3,88,5,9,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int [] arr) {

        arr[3]=43;
    }


}
