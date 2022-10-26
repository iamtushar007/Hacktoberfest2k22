package com.udayaditya;
import java.util.Scanner;
public class addsub {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String st = sc.next();
        System.out.println("YOUR NAME IS " + st);
        System.out.println("ENTER THE TWO NUMBERS:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("sum = "+ sum);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float sum = num1 + num2;
        System.out.println("sum = "+ sum);

        int num3=(int)(67.45f);
        System.out.println(num3);
        int a=258;//256 size of byte
        byte b = (byte)(a);
        System.out.println(b);

        byte a=21;
        byte b=100;
        byte c=31;
        int d=a+b/c;
        System.out.println(d);
        byte b=50;
        b=b*2;

        System.out.println(3*45.45);
        byte b =42;
        char c='a';
        short s=5643;
        int i=345434344;
        float f=5.66f;
        double d = 45.56374;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println(result);

        int count = 1;
        while(count !=5){
            System.out.println(count);
            count++;
        }
        use for if you know how many times you want to print something else use while

        float tempc= sc.nextFloat();
       float tempf= (tempc * 9/5)+32;
        System.out.println(tempf);

        int salary = 250000;
        if(salary > 10000){
            salary = salary+2000;
        }
        else{
            salary = salary+30000;
        }
        System.out.println(salary);

        int salary = 20000;
        if(salary>10000){
            salary += 20000;
        }
        else if(salary<1000){
            salary+=20000;
        }
        else{
            salary+=2000000;
        }
        System.out.println(salary);

        for(int number=0;number<=100;number+=5){   //we can also use i++ or anything similar
            System.out.println(number);
        }

        int n = sc.nextInt();
        for(int num=1;num<=n;num++){
            System.out.println(num+" \n");
        }

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num++;//or use num+=1;
        }

        int n=1;
        do {
            System.out.println("hello world");
        }while (n!=1);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max =a;
        if (b> max){
            max = b;
        }
        if (c> max){
            max = c;
        }
        System.out.println(max);

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

        char ch = sc.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }

        int n=sc.nextInt();
        int a=0;
        int b= 1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

        int n=15859;
        int count=0;
        while (n>0){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);

        int n=123456789;
        int ans=0;
        while (n>0){
            int rem = n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);


    }
}
