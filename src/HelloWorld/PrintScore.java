package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class PrintScore {
    public static void main(String[] args) {
        PrintScore a = new PrintScore();
        int rSum;
        double rAve;
        double sub1 = 90;
        double sub2 = 95;
        rAve = a.calcAve(sub1,sub2);
        System.out.println("Average score is:  " + rAve);
        rSum = a.calcSum(77, 88);
        System.out.println("Total score: " + rSum);
    }

    public int calcSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public double calcAve(double x, double y){
        double ave = (x+y) / 2;
        return ave;
    }
}

