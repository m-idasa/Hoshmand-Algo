package algorithms;

public class FindDuplicate {

    void printRepeating(int arr[], int size) {
        int i;

        System.out.println("The repeating elements are : ");

        int max = size;
        
        for (i = 0; i < size; i++)
        
            if (arr[i] > max)
            
                max = arr[i];

        
        int[] arr_copy = new int[++max];
        
        for(i=0; i < size; i++)
        
            if (arr_copy[arr[i]] == 0)
            
                arr_copy[arr[i]] = arr[i];
                
            else
            
                System.out.println(arr[i]);
                
    }
    public static void main(String []args){
        
        FindDuplicate duplicate = new FindDuplicate();

        int arr[] = { 19, 2, 3, 1, 3, 6, 19, 6 };

        int arr_size = arr.length;
 
        duplicate.printRepeating(arr, arr_size);
     }
}
