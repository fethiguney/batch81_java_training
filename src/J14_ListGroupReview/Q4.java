package J14_ListGroupReview;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Girmek istediginiz not sayısını girin");
        int notSayısı= scan.nextInt();

        List<Integer> notlar=new ArrayList<>();

        int toplam=0;
        for (int i = 0; i <notSayısı ; i++) {
            System.out.println((i+1)+". ogrencinin notunu giriniz");
            notlar.add(scan.nextInt());
            toplam+=notlar.get(i);
        }

        int sınıfOrtalaması=toplam/notSayısı;
        System.out.println("Sınıf ortalaması : "+sınıfOrtalaması);

        int sayac=0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>sınıfOrtalaması) {
                sayac++;
            }
        }

        System.out.println("Ortalamanın uzerindeki ogrenci sayısı : "+sayac);





    }
}
