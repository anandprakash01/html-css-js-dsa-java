package J10_OOPs.Polymorphism;
/*                  One name multiple forms
        Compile time polymorphism --->    Overloading(static)
        Run time Polymorphism     --->    Overriding(Dynamic)
*/
class Calculator{
    int val1;
    int val2;

    //Constructor Overloading
    Calculator(){}
    Calculator(int a,int b){
        this.val1=a;
        this.val2=b;
    }

    //method Overloading
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }

}
public class CompileTime_Overloading {
    public static void main(String[] args){
        Calculator calc=new Calculator();
        System.out.println(calc.sum(4,5));
        System.out.println(calc.sum(4.5f,5.5f));
    }
}
