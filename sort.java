import java.util.*;
class sort
{
    public static void main(String args[])
    {
        //method 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Please enter the numbers to be sorted: ");
        for(int i =0;i<n;i++)
        {
            num[i] = sc.nextInt();
        } 
        for(int i =0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(num[j]<num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("Numbers after sorting in descending order: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }

        //method 2
    
        for(int i=0;i<n-1;i++)
        {
            int temp=num[i];
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(num[j]<temp)
                {
                    temp=num[j];
                    pos=j;
                }
            }
            num[pos]=num[i];
            num[i]=temp;
        }
        System.out.println("Numbers after sorting in ascending order: ");
        for(int i=0;i<n;i++)
        {
        System.out.println(num[i]);
        }
    }
}