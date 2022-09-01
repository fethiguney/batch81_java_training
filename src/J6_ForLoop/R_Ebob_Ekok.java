package J6_ForLoop;

public class R_Ebob_Ekok {
    public static void main(String[] args) {

        //Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
        // ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :30, 40
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120

        int sayi1=30;
        int sayi2=40;
        int ebob=1;

        for (int i = 1; i <=30 ; i++) {
          if(sayi1%i==0)  {
              System.out.print(i+" ");
          }
        }
        System.out.println("");
        for (int i = 1; i <=40 ; i++) {
            if (sayi2%i==0) {
                System.out.print(i+" ");
            }
        }

        for (int i = 1; i <=sayi2 && i<=sayi1 ; i++ ) {
            if (sayi1%i==0 && sayi2%i==0) {
                ebob=i;
            }
        }
        System.out.println("");
        System.out.println("30 ve 40 icin GCD = "+ebob);
        int ekok=(sayi1*sayi2)/ebob;
        System.out.println("30 ve 40 icin LCM = "+ekok);








    }
}
