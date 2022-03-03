package com.hackerrankandothers;

import java.util.Scanner;

public class BananaAndApple {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int test=sc.nextInt();
			int banana[]=new int[test];
			int apple[]=new int[test];
			
			for (int i = 0; i < test; i++) {
				banana[i]=sc.nextInt();
			    apple[i]=sc.nextInt();}
		
			sc.close();
			
			int temp[]=new int[test];
			
			
			for(int i=0;i<test;i++) {
				
			while(banana[i]>1&&apple[i]>0){
				
				banana[i]=banana[i]-2;
				apple[i]=apple[i]-1;
				temp[i]+=1;
			}
			System.out.println(temp[i]);
			}
			
			}
		}

