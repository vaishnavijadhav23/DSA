public class Subarrays {

    // public static void subarrays(int numbers[]) {
    //     int ts = 0;
    //     for(int i=0; i<numbers.length; i++) {
    //         int sum=0;
    //         for(int j=i+1; j<numbers.length; j++) {
    //             for(int k=i; k<=j; k++) {   
    //                 System.out.print(numbers[k]+ " ");
    //                 sum = sum+numbers[k];       
    //             }
    //             ts++;
    //             System.out.println();
    //             System.out.println("sum is ="+sum);
                 
    //             sum = 0;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("TP = "+ ts);
        

    // }
    public static void part(int numbers[], int si, int ei ){
         for(int i=si; i<ei; i++) {
           
        }
        for(int j=si; j<numbers.length-1; j++) {
            System.out.println(numbers[j]+" ");

           }

    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        part(numbers, 1, 4);
       
        //subarrays(numbers);
    }
}
