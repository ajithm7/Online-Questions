package com.hackerrankandothers;
		    /*
		     * Complete the 'migratoryBirds' function below.
		     *
		     * The function is expected to return an INTEGER.
		     * The function accepts INTEGER_ARRAY arr as parameter.
		     */
		import java.util.Scanner;

		public class MigratoryBirds {

			public static int migratoryBirds(int[] array) {
				int hight = 0;
				int ans = 0;
				int type[] = { 1, 2, 3, 4, 5 };
				int temp[] = new int[5];
				for (int i = 0; i < 5; i++) {// first type loops
					for (int j = 0; j < array.length; j++) {
						if (type[i] == array[j]) {
							temp[i] = temp[i] + 1;
						}
					}
				}
				for (int k = 0; k < 5; k++) {
					if (temp[k] > hight) {
						hight = temp[k];
						ans = k + 1;
					}
				}
				return ans;
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] array = new int[n];

				for (int i = 0; i < n; i++) {
					array[i] = sc.nextInt();
				}
				sc.close();
				System.out.println(migratoryBirds(array));

			}

		}