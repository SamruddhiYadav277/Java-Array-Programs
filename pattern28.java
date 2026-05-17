/*
Q18. Write a java program to print this pattern.

	        *	*	*	*	*	*	
             *   *   *   *   *        
		       *  *	  *   *
		         *   *   *
			       *   *
			         *

*/
public class pattern28
{
	public static void main(String[] args)
	{
		int n = 6;

		for(int i = 1; i <= n; i++)
		{
			
			for(int s = 1; s <= i - 1; s++)
			{
				System.out.print(" ");
			}

			
			for(int j = 1; j <= n - i + 1; j++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}