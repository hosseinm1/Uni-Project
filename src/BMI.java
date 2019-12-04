import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in Centimeters: ");
        double height = sc.nextDouble();
        height = height/100;
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI);
        if (BMI < 18.5){
            System.out.println("Underweigct");
        }else if ((BMI < 25.0)){
            System.out.println("Normal");
        }else if ((BMI < 30.0)){
            System.out.println("Overweight");
        }else if (30.0 <= BMI){
            System.out.println("Obese");
        }
    }
}
