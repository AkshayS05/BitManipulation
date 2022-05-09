import java.util.Scanner;

public class BitManipulatteClear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = s.nextInt();
        System.out.println("Please enter the position");
        int pos = s.nextInt();
        int bitMask = 1 << pos;
        int notBitMask= ~(bitMask);
        System.out.println(notBitMask&num);

    }
}
