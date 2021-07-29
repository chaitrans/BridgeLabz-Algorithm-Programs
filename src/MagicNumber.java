import java.util.Scanner;

/**
 * Implementing insertion sort for string.
 * @author Chaitra NS
 * @since 28 July 2021
 */


public class MagicNumber {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number to define range");
        int num = s.nextInt();
        int range = (int)Math.pow(2,num);
        MagicNumber m = new MagicNumber();
        m.findMagicNum(range);
    }

    //Find Magic Number
    public void findMagicNum(int range){
        int left = 0;
        int right = range-1;
        System.out.println("Think a number between " +left+ " and " +right+ " index");
        int mid = (right+left)/2;
        while(left < right){
            System.out.println("Press 1 If the number is between " + left + " & " + mid );
            System.out.println("Press 2 If the number is between " + (mid+1) + " & " + right);
            int userChoice =s.nextInt();
            if(userChoice == 1){
                right = mid;
                mid = (right + left)/2;
            } else if(userChoice == 2){
                left = mid+1;
                mid = (right + left)/2;
            }else{
                System.out.println("Invalid Input");
            }
            System.out.println("Your Magic Number is " +mid);
        }
    }
}