package J08_OOPs.Abstraction;
            //to achieve 100% abstraction we use interface
            //to use multiple inheritance we use interface

public class Interface {
    public static void main(String[] args){
        //we can not make obj of interface,or we have to implement all the method here
        Queen  q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left, Right, Up, Down, Diagonal (in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left, Right, Up, Down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("1 step in all direction");
    }
}
