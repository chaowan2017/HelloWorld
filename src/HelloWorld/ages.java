package HelloWorld;

/**
 * Created by CHAOWAN on 9/27/2014.
 */
public class ages {
    public static void main(String[] args){
        int [] ages = {10,17,18,24,68,55};
        for(int i = 0; i < ages.length; i++){
            System.out.println("The number " + (i+1)+ " person's age is:   " + ages[i]);
        }
        String [][] name = {{"Baihao, ", "Fuck ", "you "},
                {" son of", " A ", "Bitch"}};
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(name[i][j] );
            }
        }
    }
}
