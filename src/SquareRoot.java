import java.util.Scanner;

public class SquareRoot {
    public static int findsqrt(int num) {
        if(num==0){
            return 0;
        }
        if(num>0&&num<=3){
            return 1;
        }
        int ans=0;
        for (int i = 2; i*i <=num ; i++) {
            ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(findsqrt(num));
    }


}
