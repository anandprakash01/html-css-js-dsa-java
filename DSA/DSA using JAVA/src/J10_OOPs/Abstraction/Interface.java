package J10_OOPs.Abstraction;
            //to achieve 100% abstraction we use interface
interface Animal{
                //all method are public,final and static in interface
    void eat();
    void sleep();
    void walk();

}
class Dog implements Animal{
    public void eat(){ //because method are public in interface we can not make here less restrictive method
        System.out.println("Eats biscuits and dairy milk");
    }
    public void sleep(){
        System.out.println("Sleeps all day");
    }
    public void walk(){
        System.out.println("Does not walk, only sleeps");
    }
}
public class Interface {
    public static void main(String[] args){
        //Animal a= new Animal();//we can not make obj of interface,or we have to implement all the method here;
        Dog jaggu=new Dog();
        jaggu.eat();
        jaggu.sleep();
        jaggu.walk();
    }
}
