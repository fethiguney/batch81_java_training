package J6_ForLoop;

public class I_BasamakToplamlariBulma {
    public static void main(String[] args) {

        int number=237;

        int sumOfDigits=0;
        for (int i = number; i >0 ; i=i/10) {
            sumOfDigits+=i%10;
        }
        System.out.println("Sum of Digits : "+sumOfDigits);






    }
}



