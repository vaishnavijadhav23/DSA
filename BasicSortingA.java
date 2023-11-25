import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class BasicSortingA {
  public static void selectionSort(int arr[]) {
    
    for(int i=0; i<arr.length-1; i++) {
      int min = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[j] < arr[min]) {
           min = j;
        }
      }
      //swap
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
  public static void insertionsort(int arr[]) {
    for(int i=1; i<arr.length; i++) {
      int curr = arr[i];
      int prev = i-1;
      //finding out the correct pos to insert
      while(prev >=0 && arr[prev] > curr) {
        arr[prev+1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1] = curr;


    }

  }

  public static void countingSort(int arr[]) {
    int largest=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }
    //frequency calculation
    int count[] = new int[largest+1]; //int[arr.length+1];
    for(int i=0; i<arr.length; i++) {
      count[arr[i]]++;
      System.out.println(arr[i]+" | "+count[arr[i]]);
    }
    //sorting
    int i=0;
    for(int j=0; j<count.length; j++) {
      while(count[j]>0) {
        arr[i] = j;
        i++;
        count[j]--;
      }
    }

  }
  public static void printarr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
    public static void main(String[] args) {
       // int arr[] = {5, 4, 1, 3, 2};
       //Integer arr[] = {5, 4, 1, 3, 2};
       int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        //insertionsort(arr);
        //printarr(arr);
        //Arrays.sort(arr);
       // Arrays.sort(arr,0,3);
       //Arrays.sort(arr, Collections.reverseOrder());
       countingSort(arr);
        printarr(arr);
       
} 
}
