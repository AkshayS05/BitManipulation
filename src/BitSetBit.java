import java.util.Scanner;

public class BitSetBit {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= s.nextInt();
        System.out.println("Please enter the position");
        int pos= s.nextInt();
        int bitMask= 1<<pos;
        System.out.println(bitMask|num);
    }
}
