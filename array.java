package com.udayaditya;

import java.util.Scanner;

public class array {
    public static void main(String[] args){





        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];

        int n=sc.nextInt();
        //INPUT
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                arr[row][col]=sc.nextInt();

            }
        }

       //OUTPUT
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

        //OUTPUT 2

//        for (int row=0;row<arr.length;row++){
//           System.out.println(Arrays.toString(arr[row]));
//        }


        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

               if(arr[row][col]==n){
                   System.out.println(row+""+col);
               }

            }
            System.out.println();
        }



    }
}
