package Sorting;
/** Insertion sort sorts by shifting. 
 * It is an inefficient sort.
 * It is used for partly sorted arrays which require less shifting. 
 */
import java.io.*;
class insertionsort
{
    int arr[]=new int[5];
    int n=5;

    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void sort()
    {
        int i,j,newValue;
        for(i=1;i<n;i++)
        {
            newValue=arr[i];
            j=i;
            while(j>0&&newValue<arr[j-1])
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=newValue;
        }
       System.out.println("Sorted array in ascending is: ");
        display();
        System.out.println();
        
        for(i=1;i<n;i++)
        {
            newValue=arr[i];
            j=i;
            while(j>0&&newValue>arr[j-1])
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=newValue;
        }
        System.out.println("Sorted array in descending is: ");
        display();
    }

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        insertionsort ob=new insertionsort();
        
        System.out.println("Enter 5 numbers"); //taking input from user
        for(int i=0;i<ob.n;i++)
        {
           ob.arr[i]=Integer.parseInt(in.readLine());
        }
        ob.sort();

    }
}