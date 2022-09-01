package J12_AhmetHocaOdev;

public class Q1_Boom {
    public static void main(String[] args) {

        /*
     "Integer sayılardan oluşan bir diziyi parametre olarak alan
     ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
      aksi takdirde  "dizide 7 rakamı yok"
      ifadesini döndüren bir method oluşturun".
        Örnek çıktı:
        [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
        [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
        [2, 55, 60, 97, 86] ➞ "Boom!"
         */

        int[] arr = {2, 7000, 60, 90, 86};

        int basamakdegeri = 0;
        String arrSayilar = "";

        for (int i = 0; i <arr.length ; i++) {
            while (arr[i]!=0) {
               basamakdegeri= arr [i]%10;
               arr [i] /=10;
               arrSayilar += basamakdegeri;
            }
        }
        if (arrSayilar.contains("7")) {
            System.out.println("Boom!");
        } else {
            System.out.println("Dizide 7 rakami yok");
        }


    }
}

