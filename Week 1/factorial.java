public class factorial {
    public static void main (String[] args) {
        int n = 5;
        long x = 1;

        for(int i = 1; i <= n; i++) {
            x = x * i;
        }
        
        System.out.println(n + "! is equal to: " + x + ".");
    }
}