public class MergeSort
{
    public static void main()
    {
        int i;
        int array[] = {99,6,86,15,58,35,86,4,0};
        System.out.println("Values Before the sort:");
        for(i = 0; i < array.length; i++)
            System.out.print( array[i]+"  ");
        System.out.println();
        long start = System.nanoTime();
        merge_Sort(array,0, array.length-1);
        long elapsed = System.nanoTime() - start;
        System.out.println("time taken for search in nano seconds = "+elapsed);
        System.out.print("Values after the sort:\n");
        for(i = 0; i <array.length; i++)
            System.out.print(array[i]+"  ");
        System.out.println();

    }

    public static void merge_Sort(int array[],int l, int h)
    {
        int low = l;
        int high = h;
        if (low >= high)
        {
            return;
        }
        int middle = (low + high) / 2;

        merge_Sort(array, low, middle);
        merge_Sort(array, middle +1 , high);

        int end_left = middle;
        int start_right = middle + 1;

        while (start_right <= high) 
        {
            if (array[low] < array[start_right]) 
            {
                low++;
            }
            else
            {
                int Temp = array[start_right];
                for (int i = start_right- 1; i >= low; i--) 
                {
                    array[i+1] = array[i];
                }
                array[low] = Temp;
                low++;
                end_left++;
                start_right++;
            }
        }
    }  
} 