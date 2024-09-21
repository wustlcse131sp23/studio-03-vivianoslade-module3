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
				
		for (int i = 2; i < n; i++)
		{
			allPrimeNumbers[i] = true;
			//System.out.println(allNumbers[i]);
		}
		
		/**
		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if (allPrimeNumbers[i] == true)
			{
					for (int j = i*i; j < n; j+=i)
					{
						allPrimeNumbers[j] = false;
					}
			}
		}
		**/
		// start at 2 bc 2 is the smallest prime number
		for (int i = 2; i < n; i++) // external loop keeps track of which value we are finding multiples of
		{
			if (allPrimeNumbers[i] == true)
			{
				// start at 2i because i itself can be prime (i.e. 2 is prime but 4, 6, 8, etc. is not)
				for (int j = 2*i; j < n; j += i)	// external loop keeps track of the multiples of i and marking non-prime indices as false;
				{
					allPrimeNumbers[j] = false;
				}
			}
		}
		
		
		
		
		for (int i = 2; i < n; i++)
		{
			if (allPrimeNumbers[i] == true)
			{
				System.out.println(i);
			}
		}

	}

}
