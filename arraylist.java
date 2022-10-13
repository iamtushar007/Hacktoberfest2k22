package com.udayaditya;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>(4);
        /*list.add(23);
        list.add(25);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(1);
        System.out.println(list);
        list.set(5,10);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.contains(33));
        System.out.println(list.contains(25));
        */

        for(int i=0;i<4;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<4;i++){
            System.out.println( list.get(i));
        }
       // System.out.println(list);




    }
}
