package com.hackerrankandothers;
import java.util.Scanner;
public class UtopianTree {
/*The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after n growth cycles?

For example, if the number of growth cycles is , the calculations are as follows*/
	
	

    public static int utopianTree(int n) {
    int h=1;
    for(int i=0;i<=n;i++){
        if(i==0){
            h=1;
        }
        else if(i%2!=0){
            h*=2;
        }
        else{
            h+=1;
        }
        
    }
    return h;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of test");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			System.out.println(utopianTree(n));
			sc.close();
		}
	}

}
