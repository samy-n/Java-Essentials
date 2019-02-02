package Sorting;


/**
 * Write a program to arrange numbers in array in ascending and descending order.
 */
import java.io.*;
class bubblesort
{
    int arr[]=new int[5];
    int n=5;
    
    void display()
    {
         for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    
    void descending()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Elements in descending order are:");
        display();
    }
    void ascending()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Elements in ascending order are:");
        display();
    }
    
    

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        bubblesort ob=new bubblesort();
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            ob.arr[i]=Integer.parseInt(in.readLine());
        }
        
        ob.ascending();
        ob.descending();
    }
}