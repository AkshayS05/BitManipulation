import java.util.*;
public class BitManipulate {
    public static void main(String[] args) {
//        Get Bit
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= s.nextInt();
        System.out.println("Please enter the position");
        int pos= s.nextInt();
        int bitMask= 1<<pos;
        if((bitMask & num)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
