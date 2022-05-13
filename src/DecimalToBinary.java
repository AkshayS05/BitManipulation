import java.util.Scanner;

public class DecimalToBinary {
    public static int convertDtoB(int num) {
        int ans=0;
        int pv=1;
        while(num>0){
            int remainder= num%2;
            ans+=pv*remainder;
            num/=2;
            pv*=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        System.out.println(convertDtoB(num));
    }
}

