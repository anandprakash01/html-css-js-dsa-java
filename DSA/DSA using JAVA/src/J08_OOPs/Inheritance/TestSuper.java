package J08_OOPs.Inheritance;

class Area{
    private int length;
    int width;
//    Area(){
//    }
    public Area(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int calcArea(){
        return length * width;
    }
}

class Volume extends Area{  //single level inheritance(re-usability)
    private int height;

    Volume(int length, int width, int height){
        super(length, width);
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
