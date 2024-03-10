import java.util.Scanner;

public class lab305 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=0;
        int ans=1;

        for(int i=0;i<3;){
            System.out.print("Please enter one value: ");
            a=scn.nextInt();
            
            if(a>=1 && a<10){
                for(int j=2;j<=a;j++){
                    ans*=j;
                }
                System.out.println(a+"! : "+ans);
            }
            else{
                System.out.println("Error, the value is out of range.");
            }
        }
    }
}
