package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class JudgePrime {
    public static void main (String[] args) {
        int a = 8;
        boolean result = true;
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                result = false;
                break;
            }

        }
        if (result) {
            System.out.println(a + " is a prime");
        } else
            System.out.println(a + " is not a prime");

}}
