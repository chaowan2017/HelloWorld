package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class SumOfOdd {
    public static void main(String[] args) {
        int i1 = 1, i2 = 1;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        while (i1 <= 10) {
            if (0 == i1 % 2) {
                sum1 += i1;
            }
            i1++;
        }
        System.out.println("Sum of Even Number:  " + sum1);
        do {
            if (0 == i2 % 2) {
                sum2 += i2;
            }
            i2++;
        } while (i2 <= 10);

        System.out.println("Sum of Even Number:  " + sum2);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && (i % 7 == 0 && i % 2 == 0 )) {
                System.out.println(i);
            }
        }
        for (int i3 =1; i3 <= 10; i3++){
            if(0 == i3 % 2){
                sum3 += i3;
            }
        }
        System.out.println(sum3);
        for (int i4 =1; i4 <= 10; i4++){
            for (int j =1; j <= i4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 20; k++){
            for (int f = k; f <= k; f++)
            {
                System.out.print(f+" "  );
            }

        }
        for (int x = 1; x <= 10; x++){
            if (0 == x % 10 ){
                break;
            }
            if (0 == x % 3 ){
                System.out.println("Coming");
            }
        }
        for (int y = 1; y <= 10; y++){
            if(0== y % 2 ){
                System.out.println(y);
                continue;
            }

        }
    }

}