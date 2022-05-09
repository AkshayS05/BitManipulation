import java.util.Scanner;

public class BitManipulationUpdate {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= s.nextInt();
        System.out.println("Please enter the position");
        int pos= s.nextInt();
        System.out.println("Enter 1 or 0");
        int oper= s.nextInt();
        //if 1 is selected, set operation. If 0 is selected clear operation
        int bitMask= 1<<pos;
        if(oper==1){
            //set
            int newNumber= bitMask|num;
            System.out.println(newNumber);
        }else if(oper==0){
            //clear
            int notBitMask= ~(bitMask);
            int newNumber= notBitMask & num;
            System.out.println(newNumber);
        }else{
            System.out.println("Please enter the valid number");
        }
    }
}
