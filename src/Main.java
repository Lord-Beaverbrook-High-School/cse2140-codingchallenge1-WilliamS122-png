import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your 4 digit number");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */

        int digit1 = (year/1000);//This line will give us the first digit after dividing by 1000
        int digit2 = ((year-digit1*1000)/100);//this line removes the first number before dividing by 100
        int digit3 = (((year-digit1*1000)-digit2*100)/10);//this line removes the first number and second before dividing by 10
        int digit4 =  (year%10);//this line finds the first digit through modulus

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
//I ran test of 4 digit numbers including 0s
//The code won't work with a 5 digit number or above but this could be innovated through methods and strings to find number of digits
// 3 digit numbers will just start with 0
//String inputs crash the code