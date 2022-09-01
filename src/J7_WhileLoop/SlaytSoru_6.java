package J7_WhileLoop;

public class SlaytSoru_6 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve
        bu sayiyi tam bolen sayilari
        ve toplam kac tane olduklarini
        ekranda yazdirin
         */

        int sayac=0;
        int sayi=20;

        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0) {
                System.out.print(i+" ");
                sayac++;
            }
        }
        System.out.println("");
        System.out.println(sayi+" sayisinin pozitif tam bolenleri sayisi : "+sayac);
        sayac=0;
        int i=1;
        String tamBolenler="";
        while (i<=sayi) {
            if (sayi%i==0) {
                tamBolenler+=i+" ";
                sayac++;
            }
            i++;
        }
        System.out.println(sayi+" sayisinin pozitif tam bolenleri : "+tamBolenler);
        System.out.println(sayi+" sayisinin pozitif tam bolenleri sayisi : "+sayac);




    }
}
