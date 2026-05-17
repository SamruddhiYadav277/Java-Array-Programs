/*
Q17. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*

*/
public class pattern27
{
	public static void main (String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=9;j++)
			{
				if(i==5 || i+j==6 || j - i == 4 )
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
					