public class ReverseAPair {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length-1;
                 
        while(start < end) {
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
     public static void pair(int arr[]) {
        int tp = 0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<=arr.length-1; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs = " +tp);
     }      
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        //reverse(arr);
        pair(arr);

        // for(int i=0; i<=arr.length-1; i++) {
        //     System.out.print(arr[i] + " ");
        // } 
    }  
}
