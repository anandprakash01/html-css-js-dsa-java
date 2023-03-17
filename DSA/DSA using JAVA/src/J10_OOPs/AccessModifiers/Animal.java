package J10_OOPs.AccessModifiers;

public class Animal {
    //default
    int legs;
    void eat(){
        System.out.println("Eating...");
    }

    //protected
    protected int head;
    protected void eye(){
        System.out.println("Two Eyes");
    }

    //public
    public void pet(){
        System.out.println("Its a pet animal");
    }
}
