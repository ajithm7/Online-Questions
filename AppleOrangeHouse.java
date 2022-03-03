package com.hackerrankandothers;
import java.util.Scanner;
public class AppleOrangeHouse {
	/*Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

The red region denotes the house, where  is the start point, and  is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
Assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .
When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. *A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right. **/
	/*input:7 11
5 15
3 2
-2 2 1
5 -6
output:
1
1
	 * */

	public static void main(String[] args) {/*countApplesAndOranges has the following parameter(s):

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr num");
		long s=sc.nextInt();
		long t=sc.nextInt();
		long a=sc.nextInt();
		long b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt(); 
		long[]apple=new long[m];
		long []orange=new long[n];
		
		

			
		long appleDis[]=new long[apple.length];
			int countApl=0;
			
			long orangeDis[]=new long[orange.length];
			int countOrg=0;
			for(int i=0;i<apple.length;i++){
				apple[i]=sc.nextInt();
				appleDis[i]=apple[i]+a;
				//System.out.print(appleDis[i]+" ");
			} 
			for(int i=0;i<orange.length;i++) {
				orange[i]=sc.nextInt();;
				orangeDis[i]=orange[i]+b;
				//System.out.print(orangeDis[i]+" ");
			}	
			
			
			for(int i=0;i<apple.length;i++) {
				if(appleDis[i]>=s&&appleDis[i]<=t) {
					countApl++;
				}
				
			}
			for(int i=0;i<orange.length;i++) {
				if(orange[i]<t&& orangeDis[i]<=t) {
					countOrg++;
				}
			}
			
			System.out.println(countApl);
			System.out.println(countOrg);
			
			
			sc.close();
			
		}

}
