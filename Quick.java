/**
 * Quick Sort Algorithm
 Quicksort sorts by employing a divide and conquer strategy to divide a list into two sub-lists. 
 Complexity of Quick sort is O (n log n). 
 It has the best average case behaviour for all sorting algorithms.
 The steps are:
 1. Pick an element, called a pivot, from the list (it is generally the mid of the array).
 2. Reorder the list so that all elements which are less than the pivot come before the pivot and so that all elements greater than the pivot come after it (equal values can go either way). 
 After this partitioning, the pivot is in its final position. This is called the partition operation.
 3. Recursively sort the sub-list of lesser elements and the sub-list of greater elements.
 The base case of the recursion are lists of size zero or one, which are always sorted.
 In simple pseudocode/ algorithm, the algorithm might be expressed as this:
 function quicksort(array)
 var list less, greater
 if length(array) ? 1
 return array
 select and remove a pivot value pivot from array
 for each x in array
 if x ? pivot then append x to less
 else append x to greater
 return concatenate(quicksort(less), pivot,quicksort(greater))
 */
public class Quick
{
    void quicksort(int array[], int l, int h)
    {     int low=l;
        int high=h;  
        int pivot = array[(low+high)/2]; 
        while (low <= high)
        {
            while (array[low] < pivot)
                low++; 
            while (array[high] > pivot)
                high--;
            if (low <= high)
            {  
                int temp;
                temp= array[high];
                array[high] = array[low]; 
                array[low] = temp;

                low++; 
                high--;    
            }   
        }
        for(int i=0;i<9;i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        if (l <high) 

            quicksort(array, l, high);  

        if (low < h) 
            quicksort(array, low, h);

    }

    void display(int arr[])
    {
        for(int i=0;i<9;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }

    public void main()
    {
        int arr[]= {40,20,10,50,60,30,20,80,100};
        long start = System.nanoTime();
        quicksort(arr,0,8);
        long elapsed = System.nanoTime() - start;
        System.out.println("time taken for search in nano seconds = "+elapsed);
        display(arr);
    }

}