/*
Q16. Write a java program to print this pattern.

	*	*	*	*	*
	*			*
	*		*
	*	*
	*
*/
public class pattern26
{
	public static void main (String []args)
	{
	  int n=5;
      for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n;j++)
		  {
			  if(i==1 || j==1 || i+j==n+1)
			  {
					System.out.print("* ");
			  }
			  
			  else
			  {
					System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
	}
}