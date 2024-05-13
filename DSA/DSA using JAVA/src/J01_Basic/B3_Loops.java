package J01_Basic;
import java.util.Scanner;

public class B3_Loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no : ");
        int num=0;
        int x=0;
        do{
            num =sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.print((num+x)+" ");
            x=(num+x);
        }while(true);
        System.out.println("--> You entered a no divided by 10 that's why it broken.");

    }
}
