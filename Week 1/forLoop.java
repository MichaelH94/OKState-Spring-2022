public class forLoop {
    public static void main (String[] args) {
    for(int x = 0; x < 10; x++) {
            if(x >= 5 || x == 2)  {
                System.out.println("Condition met, x is " + x);
            } else {
                System.out.println("Condition not met, x is " + x);
            }
        }
    }
}