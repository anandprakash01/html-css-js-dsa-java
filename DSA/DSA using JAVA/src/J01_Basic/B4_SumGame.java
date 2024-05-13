package J01_Basic;
import java.util.*;
public class B4_SumGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number: ");
            n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
            System.out.print("Do you want to add more ?  ---->> Press 0 for No | Press 1 for Yes : ");
            choice=sc.nextInt();

        }while(choice!=0);

        System.out.println("The sum of even numbers is " + evenSum +
                "\nThe sum of odd numbers is " + oddSum);

    }
}