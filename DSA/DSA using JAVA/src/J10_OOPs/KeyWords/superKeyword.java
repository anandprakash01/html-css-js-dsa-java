package J10_OOPs.KeyWords;

class Area{
    private int length;
    int breadth;
    Area(){
        System.out.println("Area constructor is called");
    }

    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int calcArea(){
        return length * breadth;
    }
}

class Volume extends Area {  //single level inheritance(re-usability)
    private int height;

    Volume(){
        //it should be inside Volume constructor
        // java by default calls the super() if we don't write it
        // we can also initialize property of immediate parent class
        //super();
        System.out.println("Volume constructor is called");
    }
    Volume(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public int calcVolume(){
        return height * super.calcArea();
    }
}

public class superKeyword {
    public static void main(String[] args){

        //super keyword
        Volume v=new Volume();

        //Volume v1=new Volume(4,5,10);



    }
}
