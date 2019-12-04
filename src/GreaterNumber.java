import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        int number1,number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        if (number1  > number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }


    }
}
