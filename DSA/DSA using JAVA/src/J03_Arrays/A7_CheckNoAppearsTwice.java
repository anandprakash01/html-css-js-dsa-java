package J03_Arrays;

public class A7_CheckNoAppearsTwice {
    public static boolean checkifNoappearsTwice(int a[]){
        int check[]=new int[100];
        for(int i=0;i<check.length;i++){
            check[i]=0;
        }
        for(int i=0;i<a.length;i++){
            if(check[a[i]]==1){
                System.out.println(a[i]+" is appering twice.");
                return true;

            }
            else{
                check[a[i]]=1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={2,3,5,1,10,11,8,10};
        System.out.println(checkifNoappearsTwice(arr));
    }
}

