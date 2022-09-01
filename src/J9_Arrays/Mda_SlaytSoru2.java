package J9_Arrays;

public class Mda_SlaytSoru2 {
    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array’in ic array’lerindeki
        son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int [] [] sayilar={ {1,2,3}, {4,5}, {6} };

        int carpim=1;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar [i].length ; j++) {
                if (j==sayilar[i].length-1) {
                    carpim*=sayilar [i] [j];
                }
            }
        }
        System.out.println("Array icindeki son elemanlarin carpimi : "+carpim);

    }
}
