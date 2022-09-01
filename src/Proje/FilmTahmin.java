package Proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE",
                                                            "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    public static void main(String[] args) {


/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
 */

        filmtahmin(film);

    }

    public static void filmtahmin(List<String> film) {
        Scanner scan=new Scanner(System.in);
        System.out.println("***FİLM TAHMİNİ OYUNUNA HOSGELDİNİZ***"+"\n"+
                           "Film secmek icin 1 ile "+film.size()+" arasinda bir sayi giriniz");
        int sira=scan.nextInt();
        int indeks=sira-1;
        System.out.println("sectiginiz filmin harf sayisi : "+film.get(indeks).length());
        int hakSayisi=(film.get(indeks).length()*2);
        System.out.println("film tahmini icin girebileceginiz harf hakki sayisi : "+hakSayisi);
        StringBuilder tahminfilmi=new StringBuilder(film.get(0).replaceAll("\\w", "-"));
        System.out.println(tahminfilmi);


        while (hakSayisi>0) {
            System.out.println("Film tahmini icin bir harf giriniz");
            char harf=scan.next().toUpperCase().charAt(0);
            for (int i = 0; i <film.get(indeks).length() ; i++) {
                if (harf==(film.get(indeks).charAt(i))) {
                   tahminfilmi.setCharAt(i, harf);
                }

            }
            System.out.println(tahminfilmi);
            hakSayisi--;
            if (tahminfilmi.toString().equals(film.get(indeks))) {
                System.out.println("Tebrikler filmi bildiniz...");
                break;
            }
            System.out.println("Kalan hakkiniz : "+hakSayisi);
            if (hakSayisi==0) {
                System.out.println("Uzgunum hakkiniz kalmadi");
            }

        }




    }
}
