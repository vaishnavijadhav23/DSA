
public class QuickSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei); //right
    }

    public static int partition( int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i= si-1; //(-1)  , to make places for els smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot ) {
                i++;
                //swap
                int temp = arr[j]; //3
                arr[j]  = arr[i]; //6
                arr[i] = temp; //3
                
            }
            
        }
         i++;
        //swap
        int temp = pivot;
        arr[ei]  = arr[i]; //pivot(variable) = arr[ei](index)
        arr[i] = temp;
        return i;   
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
