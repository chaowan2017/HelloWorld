package HelloWorld;

/**
 * Created by CHAOWAN on 9/26/2014.
 */
public class Compare {
    public static void main(String[] args) {
        int a =1;
        double b = 9.9;
        boolean f = true;
        boolean g = false;
        boolean c = false;
        boolean d = true;
        double score = 98.5;
        String str1 = "fuck";
        String str2 = "You";
        String str3 = (score >= 60)? "ok" : "not ok";
        System.out.println("a equals to b: " + (a == b));
        System.out.println("a greater than b: " + (a>b));
        System.out.println("a smaller or equal to b: " + (a <= b));
        System.out.println("str1 equals to str2: " + (str1 == str2));
        System.out.println(f&&g);
        System.out.println((f||g));
        System.out.println((!f));
        System.out.println((c^d));
        System.out.println("Score: " + str3);
    }
}


