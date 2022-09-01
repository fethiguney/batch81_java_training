package J8_DoWhileLoop;

public class SlaytSoru_1 {
    public static void main(String[] args) {


        int baslangic=9;
        int bitis=190;

        do {
            if(baslangic%7==0){
                System.out.print(baslangic+" ");
            }
            baslangic++;
        } while (baslangic<=bitis);


    }
}
