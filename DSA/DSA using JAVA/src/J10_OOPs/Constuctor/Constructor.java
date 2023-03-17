package J10_OOPs.Constuctor;

class Student{
    int rollNo;
    String name;
    private String password;
    int marks[];
    void getData(){
        System.out.println("rollNo is: "+ rollNo+"\nName of student is: "+name+"\npassword is: "+password);
    }
    void setPassword(String str){
        password=str;
    }
    //default constructor or non-parameterized constructor
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    //parameterized constructor
    Student(String studentName,int r,String pass){
        marks=new int[3];
        name=studentName;
        rollNo=r;
        password=pass;
    }
    Student(int r){    //constructor overloading
        rollNo=r;
    }
    //Shallow copy constructor
     Student(Student s1){
         name=s1.name;
         rollNo=s1.rollNo;
         password=s1.password;
         marks=s1.marks;  //this array only copy by reference so changes will not reflect
    }

    //deep copy constructor
//    Student(Student s1){
//        marks=new int[3];
//        name=s1.name;
//        rollNo=s1.rollNo;
//        for(int i=0;i<3;i++){
//            this.marks[i]=s1.marks[i];
//        }
//    }
}

public class Constructor{
    public static void main(String[] args){
        Student stud1=new Student("A_PracticeCodePackage.anand",45,"hr@123");
        stud1.getData();
        Student stud2=new Student();//for this now we need to create default constructor.
        //java creates default constructor only when we didn't create any constructor
        stud1.marks[0]=100;
        stud1.marks[1]=99;
        stud1.marks[2]=98;
        System.out.println(stud1.marks[0]);
        System.out.println(stud1.marks[1]);
        System.out.println(stud1.marks[2]);

        stud2.rollNo=26;
        stud2.name="hr";
        stud2.setPassword("hr@#2023");
        stud2.getData();

        Student stud3=new Student(stud1);//copy constructor
        stud3.getData();
        System.out.println(stud3.marks[0]);
        System.out.println(stud3.marks[1]);
        System.out.println(stud3.marks[2]);

    }
}
