import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter Two Numbers: ");
            if (scan.hasNextInt()) {
                num1 = scan.nextInt();
                if(scan.hasNextInt()){
                    num2 = scan.nextInt();
                    if(num1 > num2){
                        System.out.println(num1 + " is greater than " + num2);
                    } else if (num1 == num2){
                        System.out.println(num1 + " is equal to " + num2);
                    } else {
                        System.out.println(num2 + " is greater than " + num1);
                    }
                } else System.out.println("Error: Not an integer");
            } else System.out.println("Error: Not an integer");


    }
}
/*Write a program that takes two numbers as inputs from the user and compares them.
    The program should indicate which of the two numbers is bigger.
    EX: 5 is greater than 4
    EX: 3 is equal to 3
    Ensure that the user is typing invalid inputs. If they don't, an error message should be displayed and the program should stop.
    Test Runs:
    3 and 4
    5 and 5
    6 and 2
*/