public class ShortestPath {
    public static float path(String str) {
        int x=0, y=0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'N') {
                y++;
            }
            else if(ch == 'E') {
                x++;
            }
            else if(ch == 'W') {
                x--;
            }
            else { //(ch == 'S') 
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(path(str));
    }
}
