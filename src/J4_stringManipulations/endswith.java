package J4_stringManipulations;

public class endswith {
    public static void main(String[] args) {

        String input ="fethi@gmail.com";

        if (!input.contains("@gmail.com")) {
            System.out.println("gmail adresi girin");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("yazimi kontrol edin");
        }


    }
}
