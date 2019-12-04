import java.util.Scanner;

public class MilesAndKilometres {
    public static void main(String[] args) {
        int select;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your app :\n 1: KtoM\n 2: MtoK");
        select = scan.nextInt();
        if (select == 1){
            KtoM();
        }else if(select == 2) {
            MtoK();
        }else {
            System.out.println("Do you understand English!?");
        }


    }

    static void KtoM(){
        double kilometers;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter kilometers:");

        kilometers = in.nextDouble();

        double miles = kilometers / 1.61;

        System.out.println(miles + " Miles");
    }
    static void MtoK(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Miles:");
        double miles = in.nextDouble();
        double kilometers = miles * 1.61;
        System.out.println(kilometers + "KM");
    }
}
