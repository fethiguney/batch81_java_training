package Proje.ucusProjesi;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Method {





    //-----------------------Ucus Bilgileri Yazdirma------------------------------------------

    public static void ucus(String isim, String destination, String yon, int yas) {

        double priceB=500*0.1;
        double priceC=700*0.1;
        double priceD=900*0.1;

        switch (destination) {
            case "B":
                priceB=yasVeYonKontrol(destination, yas, yon, priceB);
                fisYazdirma(isim, destination, yon, yas,priceB);
                break;
            case "C":
                priceC=yasVeYonKontrol(destination, yas, yon, priceC);
                fisYazdirma(isim, destination, yon, yas, priceC);
                break;
            case "D" :
                priceD=yasVeYonKontrol(destination, yas, yon, priceD);
                fisYazdirma(isim, destination, yon, yas, priceD);
            default:
                System.out.println("Gecerli bir sehir giriniz");
        }
    }

    //---------------------------------FisYazdirma---------------------------------------

    public static void fisYazdirma (String isim, String sehir, String yon, int yas, double tutar){

        LocalDate tarih= LocalDate.now();

        LocalDateTime zaman= LocalDateTime.now();

        System.out.println("====================================="+"\n"+
                "Java Airlines"+"\n"+
                "Istanbul Sabiha Gokcen ISG"+"\n"+
                "Fligh No : "+tarih.getYear()+zaman.getHour()+"\n"+
                "Gate Number : "+sehir.toUpperCase()+Math.round(Math.random()*10)+"\n"+
                "Islem tarihi : "+tarih+"\n"+
                "Islem saati : "+zaman+"\n"+
                "=====================================");

        System.out.println( "====================================="+"\n"+
                "FROM: A  Destination: " + sehir.toUpperCase()+"\n"+
                "Müşteri Adı: " + isim.toUpperCase()+"\n"+
                "Tek yön / Gidiş Dönüş: " + yon+"\n"+
                "Yolcu yaşı: " + yas+"\n"+
                "Toplam Ödeme: " + tutar + "$"+"\n"+
                "===================================");


        System.out.println("İyi yolculuklar dileriz");
    }


    //--------------------------Yas ve Gidis Donus Bilgisine Gore Fiyatlar-------------------------

    public static double yasVeYonKontrol (String destination, int yas, String yon, double price) {
        if (yon.equalsIgnoreCase("gd")) {
            if (yas>0 && yas<12) {
                price=indirim12yasAlti(price);
                price=indirimGidisDonus(price);
                System.out.println(destination+ "sehrine GIDIS DONUS ucretiniz : "+price+"$");
            } else if (yas<24) {
                price=indirim12ile24arasi(price);
                price=indirimGidisDonus(price);
                System.out.println(destination+ "sehrine GIDIS DONUS ucretiniz : "+price+"$");
            } else if (yas>65) {
                price=indirim65yasUstu(price);
                price=indirimGidisDonus(price);
                System.out.println(destination+ "sehrine GIDIS DONUS ucretiniz : "+price+"$");
            } else {
                price=indirimGidisDonus(price);
                System.out.println(destination+ "sehrine GIDIS DONUS ucretiniz : "+price+"$");
            }
        } else if  (yon.equalsIgnoreCase("t")) {
            if (yas>0 && yas<12) {
                price=indirim12yasAlti(price);
                System.out.println(destination+ "sehrine GIDIS ucretiniz : "+price+"$");
            } else if (yas<24) {
                price=indirim12ile24arasi(price);
                System.out.println(destination+ "sehrine GIDIS ucretiniz : "+price+"$");
            }else if (yas>65) {
                price=indirim65yasUstu(price);
                System.out.println(destination+ "sehrine GIDIS ucretiniz : "+price+"$");
            } else {
                System.out.println("Indirimsiz Yolcu "+"\n"+
                                    destination+ "sehrine GIDIS ucretiniz : "+price+"$");
            }
        } else {
            System.out.println("Gecerli bir yon girisi yapiniz");
        }
        return price;
    }



    //---------------------------Indirimler---------------------------------------------------

    public static double indirim12yasAlti(double price) {
        System.out.println("12 yas alti oldugunuz icin %50 indirim uygulanacaktir");
        return price*0.5;
    }

    public static double indirim12ile24arasi(double price) {
        System.out.println("12-24 yas arasinda oldugunuz icin %10 indirim uygulanacaktir");
        return price*0.9;
    }

    public static double indirim65yasUstu(double price) {
        System.out.println("65 yas uzeri oldugunuz icin %30 indirim uygulanacaktir");
        return price*0.7;
    }

    public static double indirimGidisDonus(double price) {
        System.out.println("Biletiniz gidis donus oldugu icin %20 indirim uygulanacaktir");
        return price*0.8*2;
    }
}
