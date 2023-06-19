package J08_OOPs.Constuctor;

class Student{
    String name;
    private String password;
    int[] marks;
    void getData(){
        System.out.println("Name of Student: "+name+"\npassword: "+password);
        for (int mark : this.marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
    void setPassword(String password){
        this.password= password;
    }

    //default constructor or non-parameterized constructor
    //java creates default constructor only when we didn't create any constructor
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }

    //parameterized constructor
    Student(String studentName,String pass){
        marks=new int[3];
        this.name=studentName;
        this.password=pass;
    }

    //constructor overloading
    Student(String name){this.name=name;}

    //Shallow copy constructor
     Student(Student std){
         this.name=std.name;
         password=std.password;
         marks=std.marks;  //this array only copy by reference so changes will not reflect
    }


    // deep copy constructor
//    Student(Student std){
//        marks=new int[std.marks.length];
//        name=std.name;
//        for(int i=0;i<std.marks.length;i++){
//            this.marks[i]=std.marks[i];
//        }
//    }
}

public class Constructor{
    public static void main(String[] args){
        Student stud1=new Student("Anand","password");
        stud1.marks[0]=100;
        stud1.marks[1]=99;
        stud1.marks[2]=98;
        stud1.getData();

        Student stud2=new Student();
        //for this now we need to create default constructor.
        //java creates default constructor only when we didn't create any constructor

        stud2.name="hr";
        stud2.setPassword("hr@2023");
        stud2.setPassword("hr_password");
        stud2.getData();

        Student stud3=new Student(stud1);//copy constructor
        stud3.getData();

        stud1.marks[0]=9999;// changing stud1 marks data
        // Shallow copy constructor will change data in stud3 as well

        stud3.getData();

    }
}
