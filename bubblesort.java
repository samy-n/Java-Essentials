package Sorting;
/**
 * IN the first pass for arranging in ascending, the largest element is shifted to the last index of the array.
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
            for(int j=0;j<n-1-i;j++)//for every pass, the values are compared from the starting from 0th index to (n-1-i)th index.
            
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