import java.util.Scanner;

public class BinarytoDecimal {
    public static int convertBtoD(int num) {
        int ans=0;
        int pv=1;
        while(num>0){
            int remainder= num%2;
            ans= ans+ (pv*remainder);
            num/=10;
            pv*=2;
        }
     return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        System.out.println(convertBtoD(num));
    }
}
