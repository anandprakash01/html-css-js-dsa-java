package J10_OOPs.Polymorphism;
/*                  One name multiple forms
        Compile time polymorphism --->    Overloading(static)
        Run time Polymorphism     --->    Overriding(Dynamic)
*/
class Area{
    private int length;
    int breadth;
    //Constructor Overloading
    Area(){}
    Area(int x){}
    Area(float y){}
    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //method Overloading

    public int calcArea(int length,int breadth){  //rectangle
        return length * breadth;
    }
    int calcArea(int a){    //Square
        return a*a;
    }
    float calcArea(float r){    //circle
        return (float)(Math.PI * r * r);
    }

}
public class CompileTime_Overloading {
    public static void main(String[] args){
        Area circle= new Area();
        Area squre= new Area();
        float area=circle.calcArea( (float)4 );
        int squreArea=squre.calcArea(4);
        System.out.println(area);
        System.out.println(squreArea);
    }
}
