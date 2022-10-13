package com.udayaditya;
public class arraymaxvalue {
    public static void main(String[] args){
        int[] arr={1,4,2,77,45,66,81};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3));
    }
    static int maxrange(int[] arr, int start, int end){
        int maxval=arr[start];
        for (int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    static int max(int[] arr){
        int maxval=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
