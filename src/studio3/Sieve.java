package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int n = in.nextInt();
		
		boolean[] allPrimeNumbers = new boolean[n];
			
		// start all numbers out with the value of true (representing prime)
		for (int i = 2; i < n; i++)
		{
			allPrimeNumbers[i] = true;
		}
		
		// this is the optimized (more complex) algorithm given by Wikipedia
		// for (int i = 2; i <= Math.sqrt(n); i++)	// uses sqrt(n) bc there will be no prime factor for n that is greater than sqrt(n) (e.g. if n=16, then all factors of 16 are 1 & 16, 2 & 8, 4 & 4. None of the factors of 16 exceed sqrt(16) = 4)
		// {
		// 	if (allPrimeNumbers[i] == true)		// checks that this value is not false (e.g. if we have already checked 2, and now we are checking 4, 4 will have already been marked as false bc it is a multiple of 2. There is no reason to check the multiples of 4 since we already checked the multiples of 2)
		// 	{
		// 			for (int j = i*i; j < n; j+=i)	// j starts at i*i bc all values before i*i will have already been marked as composite/prime (e.g. if we're marking multiples of 5, 5*2, 5*3, and 5*4 will have already been checked since we would have already checked the multiples of 2, 3, & 4)
		// 			{
		// 				allPrimeNumbers[j] = false;
		// 			}
		// 	}
		// }
		

		// start at 2 bc 2 is the smallest prime number
		for (int i = 2; i < n; i++) // external loop keeps track of which value we are finding multiples of
		{
			if (allPrimeNumbers[i] == true)
			{
				// start at 2i because i itself can be prime (i.e. 2 is prime but 4, 6, 8, etc. is not)
				for (int j = 2*i; j < n; j += i)	// internal loop keeps track of the multiples of i and marking non-prime indices as false;
				{
					allPrimeNumbers[j] = false;
				}
			}
		}
		
		// printing results
		for (int i = 2; i < n; i++)
		{
			if (allPrimeNumbers[i] == true)
			{
				System.out.println(i);
			}
		}

	}

}
