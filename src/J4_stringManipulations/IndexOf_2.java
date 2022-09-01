package J4_stringManipulations;

public class IndexOf_2 {
    public static void main(String[] args) {

        String str="Bugun Pazar ama ben Java ogrenmek icin " +
                "bilgisayar basında cabaliyorum. Java ogrenmek " +
                "istiyorum";

        int strFirstIndex=str.indexOf("Java");
        int strSecondIndex=str.indexOf("Java", strFirstIndex+1);

        if (strFirstIndex==-1) {
            System.out.println("Cumlede Java gecmiyor");
        } else if (strSecondIndex>=0) {
            System.out.println("Cumlede Java birden fazla kullanilmis");
        } else {
            System.out.println("Cumlede Java bir defa kullanilmis");
        }
    }
}
