package J10_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SlaytSoru_6 {
    public static void main(String[] args) {

        /*
        1'den baslayarak istenen kadar Fibonacci sayisini
        bir liste olusturup yazdiriniz
         */

        int input=10;
        int fibo1=0;
        int fibo2=1;
        int fibonacci=0;
        List<Integer> fibonacciList=new ArrayList<>();
        for (int i = 1; i <=input ; i++) {
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            fibonacciList.add(fibonacci);
        }
        System.out.println(input+" adet fibonacci sayisi listesi : "+fibonacciList);





    }
}
