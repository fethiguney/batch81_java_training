package J6_ForLoop;

public class HuseyinHocaSoru1 {
    public static void main(String[] args) {
        /*
        Soru 1 : Döngü kullanarak klavyeden 10 tam sayı alın ve ortalama değerini ekrana yazdırın.
         */
        String cumle = "Javaisalsoeasy";
        String bulunan = "";
        for (int i = 0; i < cumle.length(); ++i) {
            String h1 = cumle.substring(i, i + 1);
            for (int j = i + 1; j < cumle.length(); j++) {
                String h2 = cumle.substring(j, j + 1);
                if (h2.equals(h1) && !bulunan.contains(h2)) {
                    // h1 ve h2 aynı karakter ise ve bulunan diye tanımladığımız string içinde yok ise ekletmek için.
                    // contains kullanmaz isek aynı karakterden 3 adet var ise stringe üçünüde ekliyor.
                    bulunan = bulunan + " " + h2;
                }
            }
            System.out.print(bulunan);

        }

    }

}
