package Sorting;
/**
 * In the first pass for ascending, smallest element comes at the first position.
 */

import java.io.*;
class selectionsort
{
    String arr[];
    int n;
    selectionsort(int num)
    {
        n=num;
        arr=new String[n];
    }

    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter "+n+" names");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.readLine();
        }
    }

    void SelectionSort()
    {
        int min;
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if((arr[min].compareToIgnoreCase(arr[j]))>0)
                {
                    min=j;
                }
            }
            String t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        System.out.println("Sorted array in ascending is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        int max;
         for(int i=0;i<n-1;i++)
        {
            max=i;
            for(int j=i+1;j<n;j++)
            {
                if((arr[max].compareToIgnoreCase(arr[j]))<0)
                {
                    max=j;
                }
            }
            String t=arr[max];
            arr[max]=arr[i];
            arr[i]=t;
        }
        System.out.println("Sorted array in descending is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void main()throws IOException
    {
        

        selectionsort ob=new selectionsort(20);
        ob.input();
        ob.SelectionSort();

    }
}
