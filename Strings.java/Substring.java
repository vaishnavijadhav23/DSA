public class Substring {
    public static void substring(String str, int si, int ei) {
        // si = 0;
        // for(int i=si; i<ei; i++) {
        //     System.out.print(str.charAt(i));
        // }
        String str1 = "";
        for(int i=si; i<ei; i++) {
            str1 += str.charAt(i);
        }
         System.out.println(str1);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        substring(str, 0, 5);


    }
    
}
