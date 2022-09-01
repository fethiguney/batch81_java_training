package J3_Ternary_Switch;

public class Switch_Sayi {
    public static void main(String[] args) {

        int sayi=109;

        switch (sayi) {
            case (10) :
                System.out.println("The smallest two digit number");
                break;
            case (100) :
                System.out.println("The smallest three digit number");
                break;
            case (1000) :
                System.out.println("The smallest four digit number");
                break;
            default:
                System.out.println("change the number you entered");
        }

    }
}
