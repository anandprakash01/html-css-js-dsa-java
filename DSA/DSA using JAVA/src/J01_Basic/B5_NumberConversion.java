package J01_Basic;
import java.util.Scanner;

public class B5_NumberConversion {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary No : ");
        int n=scan.nextInt();
        biToDesi(n);

        System.out.print("Enter a Desimal No : ");
        int numb=scan.nextInt();
        int origin=numb;
        System.out.println("Binary no of "+origin+" is : "+ DesimalToBinary(numb));
    }

    public static int DesimalToBinary(int a){

                    /* this will only give u the 1's
                if no if totally divisible by 2
                because if u add remender 0 to result it will
                always be 0 till remender 1 is come */

        // int result=0;
        // while(a>0){
        //     int remender=a%2;
        //     result=(result*10)+remender;
        //     a/=2;
        // }
        // int reverse=0;
        // while(result>0){
        //     int last=result%10;
        //     reverse=(reverse*10)+last;
        //     result/=10;
        // }
        // return reverse;

        // int bin=0;
        // int count=0;
        // while(a>0){
        //     int rem=a%2;
        //     bin=bin+(rem*((int)Math.pow(10,count)));
        //     count++;
        //     a/=2;
        // }
        // return bin;

        //by storing result in array

        int ans[]=new int[32];
        int i=0;
        while(a>0){
            ans[i]=a%2;
            a/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(ans[j]);
        }
        return 0;
    }
    public static void biToDesi(int a){

        int desiNo=0;
        int pow=0;
        int originalNo=a;
        while(a>0){
            int lastdigit=a%10;
            desiNo=desiNo+(lastdigit*(int)Math.pow(2,pow++));
            a/=10;
        }
        System.out.println("Desimal no of "+originalNo+" is : "+ desiNo);
    }

}
