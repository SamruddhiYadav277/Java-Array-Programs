/*
 WAP to display frequency of every element in ascending array
 (10,10,10,20,20,30,40,40,40)
*/
public class frequency
{
    public static void main(String[] args)
    {
        int a[] = {10,10,10,20,20,30,40,40,40,40};
        int count = 1;
        int i = 0;
        int j = 1;

        while(j < a.length)
        {
            if(a[i] == a[j])
            {
                count++;
                j++;
            }
            else
            {
                System.out.println(a[i] + "=" + count);
                i = j;
                j++;
                count = 1;
            }
        }

        // print last element frequency
        System.out.println(a[i] + "=" + count);
    }
}