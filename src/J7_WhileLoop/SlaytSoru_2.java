package J7_WhileLoop;

public class SlaytSoru_2 {
    public static void main(String[] args) {

        /*
        For loop ve while Loop kullanarak 3 basamakli sayilardan
        15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
         */

        int bas=99;
        int bit=1000;
        while (bas<bit){
            if(bas%15==0 || bas%20==0 || bas%90==0) {
                System.out.println(bas+" ");
            }
            bas++;
        }


    }
}
