package J05_String;

public class S6_ShortestPath {
    public static void Shortestpath(){
        String s="WNEENESENNN";     //east,west,north,south
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                x++;
            }
            else if(s.charAt(i)=='W'){
                x--;
            }
            else if(s.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        float distance=(float)Math.sqrt(x2+y2);
        System.out.println(distance);
    }
    public static void main(String args[]){
        String str="AnandPrakash";
        Shortestpath();
    }
}
