import java.util.*;
public class BSearch {

    public static int BSearch(int arr[], int key) {
        int start = 0, end = arr.length-1;
        for(int i=0; i<arr.length; i++){
            //while(start<=end) {
             int mid = (start+ end)/2;
            
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
           
       // }
        return -1;
        }
        

    public static void main(String[] args) {
        int arr[] = {3, 9, 7, 2, 6, 10};
     System.out.println(BSearch(arr, 10));
    }
}
    
