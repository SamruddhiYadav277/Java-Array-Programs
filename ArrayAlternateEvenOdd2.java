/*
even and odd numbers alternate without using additional Array
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]

*/
class ArrayAlternateEvenOdd2
{
   public static void main(String[]args)
    {       
        int[]a={22,44,33,55,66,77};    
         int i=0;
		 int j=a.length;
		 while(i<a.length)
		 {
			 if(i%2==0)//even position elements
			 {
				 if(a[i]%2==0)
				 {
					 i++;
                					 
				 }
				 else
				 {
					 j=a.length-1;
					 while(j>i)
					 {
						 if(a[j]%2==0)
						 {
							 int temp=a[i];
							 a[i]=a[j];
							 a[j]=temp;
							 i++;
                           break;//break while(j>i)							 
						 }
					     j--;
					 }
				 }
				 
			 }
			 else
			 {
				if(a[i]%2!=0)
				 {
					 i++;		
                    					 
				 } 
				 else
				 {
					  j=a.length-1;
					 while(j>i)
					 {
						 if(a[j]%2!=0)
						 {
							 int temp=a[i];
							     a[i]=a[j];
							     a[j]=temp;
							 i++;
                           break;//break while(j>i)							 
						 }
					     j--;
					 }
				 }
			 }
		 }
        //print new array elemetns
		
                       for( i=0;i<a.length;i++)
                          {
                            System.out.println(a[i]);
                          }
                     
    }
}
