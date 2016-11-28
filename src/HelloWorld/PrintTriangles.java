package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class PrintTriangles {
    public static void main(String[] args) {
        PrintTriangles a = new PrintTriangles();
        int lastnum;
        lastnum = a.Printing(5);
        System.out.println(lastnum);
    }

    public int Printing(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.printf("%02d ", count);
            }
            System.out.println();
        }
        return count;


    }

}