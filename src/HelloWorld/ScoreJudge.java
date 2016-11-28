package HelloWorld;

/**
 * Created by CHAOWAN on 9/26/2014.
 */
public class ScoreJudge {
    public static void main(String[] args){
        int score = 99;
        if (score>=60){
            if (score >= 80){
                if(score >= 90){
                    System.out.println("Good Score");
                }
                else {
                    System.out.println("Nice! ");
                }
            }
            else {
                System.out.println("Fine One ");
            }
        }
        else {
            System.out.println("Failed");
        }
    }
}
