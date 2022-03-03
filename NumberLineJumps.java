package com.hackerrankandothers;
import java.util.Scanner;

public class NumberLineJumps {

    public static void kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
         int defv=v1-v2;
            if(defv<=0){
             System.out.print("NO");
            }
            else{
                int defx=x1-x2;
                
            System.out.print(defx%defv==0?"YES":"NO");

    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        sc.close();
        kangaroo(x1, v1, x2, v2);
    }
}// 0 3 4 2