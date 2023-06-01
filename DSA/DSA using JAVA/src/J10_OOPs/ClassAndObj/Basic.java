package J10_OOPs.ClassAndObj;

public class Basic {
    public static void main(String[] args){
        // Student object
        Student stud=new Student();
        stud.name="Anand";
        stud.rollNo=45;
        stud.setPassword("password");
        System.out.println("Name: "+stud.name);
        System.out.println("RollNo: "+stud.rollNo);
        System.out.println("Password for "+stud.name+" : "+stud.getPassword());

        stud.rollNo=46;
        System.out.println("RollNo is: "+stud.rollNo);
        //using method
        stud.setrollNo(100);
        //Stud.password //we can not access it directly cause its private

        Student stud2=new Student();
        System.out.println("Name is: "+stud2.name);
        System.out.println("RollNo is: "+stud2.rollNo);
        System.out.println(stud2);

    }
}

class Pen{
    String color;
    void setColor(String color){
        this.color=color;
    }
}

class Student{
    String name;
    int rollNo;
    private String password;
    // private can be only accessed via method(getter/setter), we can not access it outside this class

    void setrollNo(int data){
        rollNo=data;
    }
    void setPassword(String str){
        password=str;
    }
    String getPassword(){
        return password;
    }
}
