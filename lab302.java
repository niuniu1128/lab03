public class lab302 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                n=n+=4;
            }
        }System.out.printf("count = %d",n);
    }
}
