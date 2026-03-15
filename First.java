import java.util.Scanner;

class First{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int length=sc.nextInt();
    for(int i=0;i<length;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
         int current=a;
         int x=1;

         for(int j=0;j<n;j++){
            current+=x*b;
            System.out.print(current+" ");
            x = x * 3;

         }

         
    }
 }
}