package J3_Ternary_Switch;

import java.util.Scanner;

public class YolcuSorusu {
    public static void main(String[] args) {


        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
          Mesafe başına ücret 0,10 TL / km olarak alın.
          İlk olarak uçuşun toplam fiyatını hesaplayın ve
          sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
          Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
          yolculuk tipi ise 1 veya 2) olmalıdır.
          Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
          Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
          Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
          Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
          İpucu         Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150
         */

        Scanner scan=new Scanner(System.in);

        double totalCost=0;

        System.out.print("Mesafeyi girin :");
        int distance=scan.nextInt();

        System.out.print("Yasinizi girin :");
        int age=scan.nextInt();

        System.out.println("Yolculuk tipi\nTek yon icin 1'e\nGidis-Donus icin 2'ye basin");
        int travelType=scan.nextInt();

        switch (travelType) {
            case 1:
                if (age<0 || distance <0 ) {
                    System.out.println("Mesafe ve yas degerleri pozitif olmalidir");
                } else if (age<12) {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.5);
                }else if (age<24) {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.1);
                } else if (age<65) {
                    totalCost=(distance* 0.10);
                } else  {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.3);
                } break;

            case 2:
                if (age<0 || distance <0 ) {
                    System.out.println("Mesafe ve yas degerleri pozitif olmalidir");
                } else if (age<12) {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.50);
                    totalCost=2*(totalCost-(totalCost* 0.2));
                }else if (age<24) {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.10);
                    totalCost=2*(totalCost-(totalCost* 0.2));
                } else if (age<65) {
                    totalCost=(distance* 0.10);
                    totalCost=2*(totalCost-(totalCost* 0.2));
                } else  {
                    totalCost=(distance* 0.10)-(distance* 0.10*0.30);
                    totalCost=2*(totalCost-(totalCost* 0.2));

                } break;

            default:
                System.out.println("Hatali veri girdiniz !");
        }
        System.out.println("Toplam Tutar : "+totalCost);


    }
}
