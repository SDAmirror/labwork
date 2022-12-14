package kz.aitu;

import java.util.Scanner;

public class t6 {

    public int factorial(int n,int k,int f){

        f=k*f;

        if (k==n) return f;
        else return factorial(n,k+1,f);

    }

    public void run() {
        int n;
        Scanner Scanner = new Scanner(System.in);
        n = Scanner.nextInt();
        if (n==0) System.out.println(1);
        else
            System.out.println(factorial(n,1,1 ));;



        System.out.println();


    }



}
