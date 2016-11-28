package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class PrintNum {
    public static void main(String[] args){
        int num[][] = new int[5][5];
        int count = 0;
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 5; j++){
                num[i][j] = count++;
                System.out.printf("%02d ", num[i][j]);
            }
            System.out.println();
        }
    }
}
