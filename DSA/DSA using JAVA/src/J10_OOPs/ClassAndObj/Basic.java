package J10_OOPs.ClassAndObj;

class Student{
    int rollNo;
    String name;
    private String password;// it can be only accessed via method, we can not access it outside this class

    void setrollNo(int data){
        rollNo=data;
    }
    int getrollNo(){
        return rollNo;
    }
    void setPassword(String str){
        password=str;
    }
    String getPassword(){
        return password;
    }
}
public class Basic {
    public static void main(String[] args){
        Student stud1=new Student();
        stud1.rollNo=45;
        stud1.name="A_PracticeCodePackage.anand";
        System.out.println("RollNo is: "+stud1.rollNo);
        System.out.println("Name is: "+stud1.name);
        stud1.rollNo=46;
        System.out.println("RollNo is: "+stud1.rollNo);
        //using method
        stud1.setrollNo(100);
        System.out.println(stud1.getrollNo());
        //S1.password //we can not access it directly
        stud1.setPassword("12@123@hr");
        System.out.println("Password for "+stud1.name+" is: "+stud1.getPassword());

        Student stud2=new Student();
        System.out.println("RollNo is: "+stud2.rollNo);
        System.out.println("Name is: "+stud2.name);
    }
}
