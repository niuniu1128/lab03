import java.util.Scanner;
public class lab301 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Input:");
        int n=scn.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+=i;
        }
        System.out.printf("1+...+%d=%d",n,sum);
    }
}
