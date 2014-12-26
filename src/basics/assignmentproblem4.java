package basics;

import java.util.Scanner;

public class assignmentproblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int[] prime = new int[100];
		int[] countprime = new int[100];
		int l, king = 1;
		for (int p = 0; p < 100; p++) {
			prime[p] = 0;
			countprime[p] = 0;
		}
		for (int j = 2; j <= num; j++)// factors
		{
			int flag = 0;
			if (num % j == 0)// is j a factor
			{

				for (int k = 2; k <= j/2; k++) {// is j a prime factor

					if (j % k == 0) {
						flag = 1;
						break;
					}
				}

				if (flag != 1 || j == 2) {
					prime[j] = j;
					l = num;
					while (l % j == 0) {//count the same no of prime factors
						countprime[j] = countprime[j] + 1;
						l = l / j;
					}

				}
			}
		}
		//Output Format
		System.out.print(num + "  ->  ");
		for (int p = 0; p < 100; p++) {
			if (countprime[p] != 0) {
				if (king != 1) {
					System.out.print("*");
				}
				System.out.print(prime[p] + "^" + countprime[p]);
				king = 2;
			}
		}
		scan.close();
	}
}
