

public class LinearSearch {
   public static int LS (int numbers[], int key) {

    for(int i=0; i<numbers.length; i++) {
        if(numbers[i] == key) {
            return i;
        }
    }
    return -1;
   } 
   public static int Largest(int numbers[]) {
    int largest = 0;
    for(int i=0; i<numbers.length; i++) {
        if(numbers[i] >= largest) {
            largest = numbers[i];
        }
    }
    return largest;
   }
   
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6};
       System.out.println(LS(numbers, 6));
    }
    
}
