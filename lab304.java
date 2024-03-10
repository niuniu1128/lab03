import java.util.Scanner;
public class lab304 {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a=0;
        double sum=0;
        int count=0;
        double average=0;

        System.out.print("Please enter meal dollars or enter -1 to stop: ");
        a=sc.nextInt();

        while(a!=-1){
            sum+=a;
            count++;
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            a=sc.nextInt();
        }
        average=(double)sum/count;
        System.out.printf("餐點總費用:%.1f \n",sum);
        System.out.printf(" %d 道餐點平均費用為: %.2f %n",count,average);
    }
}
