public class nestedLoop {
    public static void main (String[] args) {
        int x = 10;
        while(x < 20) {
            for(int y = 5; y < 25; y=y+5) {
                System.out.println(y + " " + x);
                x++;
            }
        }
    }
}