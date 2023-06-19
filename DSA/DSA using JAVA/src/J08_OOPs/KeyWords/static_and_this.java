package J08_OOPs.KeyWords;

class Employee{
    private int Id;
    private String name;
    private int age;
    final int maxHolyday=100; //now we can not change this

    static int count=0;//to share with all object's we have to use static keyword

    static void msg(){//its independent of the obj so static
        System.out.println("Class of "+count+" students");
    }
    Employee(){
        System.out.println("a new Student is registered");
        count++;
    }
    Employee(int Id,int age,String name){
        this.Id=Id;// because variable names are same we have to use this keyword
        this.age=age;
        this.name=name;
        count++;
    }
}
public class static_and_this {
    public static void main(String[] args){
        Employee e=new Employee();
        Employee.msg();//direct call via class name coz its static method
        System.out.println(e.maxHolyday);
    }
}
