package J01_Basic;

public class B6_Patterns {

    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        int n=7,m=14;
        //HollowRactangle(n,m);
        //Halfpyramid(n);
        //InvertedHalfPyramidNumbers(n);
        FloydsTringle(n);
        O1tringle(n);
        butterfly(n);
    }

    public static void HollowRactangle(int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 || i==(a-1) || j==0 || j==(b-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }System.out.println();
    }

    public static void Halfpyramid(int a){
        for(int i=0;i<a;i++){
            //for(int j=0;j<a;j++){
            for(int k=0;k<(a-i);k++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
            //}
        }System.out.println();
    }
    public static void InvertedHalfPyramidNumbers(int a){
        for(int i=0;i<a;i++){
            for(int j=1;j<=(a-i);j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void FloydsTringle(int x){
        int count=1;
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void O1tringle(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

