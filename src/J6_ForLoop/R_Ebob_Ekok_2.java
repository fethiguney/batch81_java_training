package J6_ForLoop;

import java.util.Scanner;

public class R_Ebob_Ekok_2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("please enter number1:");
        int number1 = scan.nextInt();
        System.out.print("please enter number2:");
        int number2 = scan.nextInt();
        int ebob=0;
        int ekok=0;
        for (int i = 1; i <=number1*number2; i++) {
            if (number1%i==0&&number2%i==0){
                ebob =i;

            }
            for (int j =number1*number2; j>0; j--) {
                if(number1*number2%j==0 && j%number1==0 && j%number2==0){
                    ekok=j;
                }
            }
        }System.out.println("en buyuk ortak boleni "+ebob);
        System.out.println("en kucuk ortak kati "+ekok);
    }
}
