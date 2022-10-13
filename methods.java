package com.udayaditya;

import java.util.Scanner;

public class methods {
    public static void main(String args[]){
        sum();
        int ans=sub();
        System.out.println(ans);
    }
    static void sum(){
        Scanner st = new Scanner(System.in);
        System.out.println("write two numbers:");

        int a = st.nextInt();
        int b = st.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
    static int sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("write two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = a-b;
        return sub;

    }
}
