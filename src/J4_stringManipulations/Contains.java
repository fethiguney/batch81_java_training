package J4_stringManipulations;

public class Contains {
    public static void main(String[] args) {

        String input="fethi@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("gmail adresi giriniz");
        } else if (input.lastIndexOf("@gmail.com")==(input.length()-10)) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("yazimi kontrol edin");
        }

        String sentence="Bu cumlede buyuk ve kucuk kelimesi geciyor";
        if (sentence.contains("buyuk") && sentence.contains("kucuk")) {
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (sentence.contains("buyuk")) {
            System.out.println(sentence.toUpperCase());
        } else if (sentence.contains("kucuk")) {
            System.out.println(sentence.toLowerCase());
        } else {
            System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
        }


    }
}
