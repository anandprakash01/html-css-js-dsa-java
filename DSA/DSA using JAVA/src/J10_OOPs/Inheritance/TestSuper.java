package J10_OOPs.Inheritance;

class Area{
    private int length;
    int breadth;
//    Area(){
//    }

    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int calcArea(){
        return length * breadth;
    }
}

class Volume extends Area{  //single level inheritance(re-usability)
    private int height;

    Volume(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public int calcVolume(){
        return height * super.calcArea();
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Area a = new Area(2, 3);
        System.out.println(a.calcArea());

        Volume v = new Volume(2, 3, 4);
        System.out.println(v.calcVolume());
    }
}
