package J10_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SlaytSoru_5 {
    public static void main(String[] args) {

        /*
        verilen bir sayidan kucuk tum Fibonacci sayilarini
        bir liste olarak olusturup yazdirin
         */

        int input=50;
        List<Integer> fibonacciList=new ArrayList<>();
        fibonacciList.add(0);
        int fibo1=0;
        int fibo2=1;
        int fibonacci=0;
        for (int i = 0; fibonacci <input ; i++) {
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            if (fibonacci<input) {
                fibonacciList.add(fibonacci);
            }
        }
        System.out.println("Girien sayidan kucuk fibonacci sayilari : "+fibonacciList);

    }
}
