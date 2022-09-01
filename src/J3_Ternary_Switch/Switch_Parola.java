package J3_Ternary_Switch;

import java.util.Scanner;

public class Switch_Parola {
    public static void main(String[] args) {
        // /*
        //        Kullanicidan kullanici adini ve parolasini girmesini isteyin
        //        Kullanici adi ve şifreyi (koşul olarak if içerisinde siz belirleyin)
        //        Eger kullanıcı adı ve şifre uyumlu ise ekrana "Girisiniz Yapıldı" yazdırın
        //        Diger durumda "Hatali giris yaptiniz!
        //        Sifrenizi sifirlamak isterseniz 'evet' istemezseniz 'hayır' yazın  " mesajını verin
        //        Kullanici 'hayir' derse ekrana "Giris sonlandirildi!" yazdirin
        //        Kullanici 'evet' derse ekrana "Sifreniz eski sifreniz ile ayni olmamali!
        //        Yeni sifrenizi Giriniz :" yazdirin
        //        Farkli bir yanit girdiginde ekrana "Hatali secim yaptınız!" yazdirin
        //        Kullanicinin olusturdugu yeni sifre eski sifresiyle ayni olursa konsola
        //        "Sifreniz eski sifreniz ile ayni olamaz !" yazdirin
        //        Diger durumda ekrana "Yeni sifreniz basariyla olusturuldu !" yazdirin
        //         */

        Scanner scan= new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz :");
        String userName=scan.next();

        System.out.print("Parolanızı giriniz :");
        String password=scan.next();

        if (userName.equals("java") && password.equals("1234")) {
            System.out.println("Girisiniz yapildi");
        } else {
            System.out.println("Hatali giris yapıldı");
            System.out.println("Sifrenizi sifirlamak isterseniz 'evet' istemezseniz 'hayır' yazın");
            String answer=scan.next().toLowerCase();
            if (answer.equals("hayır")) {
                System.out.println("Giris sonlandirildi");
            } else if (answer.equals("evet")) {
                System.out.println("Sifreniz eski sifreniz ile ayni olmamali");
                System.out.print("Yeni sifrenizi giriniz :");
                String newPassWord=scan.next();
                if (newPassWord.equals("1234")) {
                    System.out.println ("Sifreniz eski sifreniz ile ayni olamaz");
                } else {
                    System.out.println("Yeni sifreniz basariyla olusturuldu");
                }
            } else {
                System.out.println("hatali secim yaptınız");
            }
        }






    }
}
