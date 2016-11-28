package HelloWorld;

/**
 * Created by CHAOWAN on 10/1/2014.
 */
public class People {
    public void peopleInfo(){
        final String sex = "male";
        class Student{
            String ID = "455135";
            public void print(){
                System.out.println("sex:  " + sex);
                System.out.println("ID:   " + ID);
            }
        }
        Student a = new Student();
        a.print();
    }
public static void main(String[] args){
    People b = new People();
    b.peopleInfo();
}
}

