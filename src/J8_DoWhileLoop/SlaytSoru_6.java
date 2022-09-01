package J8_DoWhileLoop;

import java.util.Scanner;

public class SlaytSoru_6 {
    public static void main(String[] args) {

        /*
        Kullanicidan toplamak icin sayi isteyin
        toplam 500’e ulasincaya kadar devam istemeyi ettirin.
        Toplam 500’e ulastiginda veya gectiginde
         -toplami
         -kac sayi girildigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        int sumOfNumbers=0, numberOfNumbers=0, number;

        do {
            System.out.println("Enter a number");
            number=scan.nextInt();
            sumOfNumbers+=number;
            numberOfNumbers++;

        }while (sumOfNumbers<=500);
        System.out.println("Sum of numbers : "+ sumOfNumbers);
        System.out.println("Number of numbers you entered : "+numberOfNumbers);





    }
}
