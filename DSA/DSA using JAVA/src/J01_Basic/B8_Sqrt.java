package J01_Basic;

public class B8_Sqrt {
    public static void main(String[] args){
        System.out.println(sqrt(2147395600));//wrong
    }
    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int floor = 0;
        for (int i = 1; i <= x; i++) {
            if (i * i <= x) {
                floor = i;
            }
            else {
                break;
            }
        }
        return floor;
    }
}
