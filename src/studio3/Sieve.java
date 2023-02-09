package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Limit: ");
		int n = in.nextInt();
		
		boolean[] allNumbers = new boolean[n];
				
		for (int i = 2; i < n; i++)
		{
			allNumbers[i] = true;
			//System.out.println(allNumbers[i]);
		}
		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if (allNumbers[i] == true)
			{
					for (int j = i*i; j < n; j+=i)
					{
						allNumbers[j] = false;
					}
			}
		}
		for (int i = 2; i < n; i++)
		{
			if (allNumbers[i] == true)
			{
				System.out.println(i);
			}
		}

	}

}
