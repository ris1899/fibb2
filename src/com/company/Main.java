package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Input n to print first n numbers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n==1){
            System.out.println(1);
            return;
        }
        else if (n==2){
            System.out.println(0);
            System.out.println(1);
        }
        else{
            solve(n);
        }

    }
    public static void solve(int n){

        System.out.println(0);
        int a=0,b=1;
        int num;
        for(int i=2;i<=n;i++){
            num=a+b;
            System.out.println(num);
            b=a;
            a=num;

        }

    }
}
