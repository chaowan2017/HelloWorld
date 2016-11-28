package HelloWorld;

/**
 * Created by CHAOWAN on 9/6/2014.
 */
public class ChaoWan {
    private String name = "ChaoWan";

    public class Student{
        String ID = "455135";
        public void stuInfo(){
            System.out.println("name: " + name );
            System.out.println("ID: "+ ID);
        }

    }

    public static void main (String[] args) {
        ChaoWan a = new ChaoWan();
        Student b = a.new Student();
        b.stuInfo();
    }
}