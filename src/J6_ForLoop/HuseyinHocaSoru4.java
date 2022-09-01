package J6_ForLoop;

public class HuseyinHocaSoru4 {
    public static void main(String[] args) {

        //Soru 4: Bir kelime veya cümle giriyoruz.
        // İlk harften başlayarak her satırda bir karakter daha ekleyerek alt alta yazdırıyoruz

        String input="ANKARA";



        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
        for (int i = input.length()-2; i >=0 ; i--) {

        }

    }
}
