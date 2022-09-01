package J4_stringManipulations;

public class Soru1 {
    public static void main(String[] args) {
        //String methodlarini kullanarak "Java ogrenmek123 Cok guzel@" ifadesini
        //"Java ogrenmek cok guzel" haline getiriniz

        String input="Java ogrenmek123 Cok guzel@";

        input=input.replace(" ", "xxx");
        input=input.replaceAll("\\d", "");
        input=input.replaceAll("\\W", "");
        input=input.replace("C", "c");
        input=input.replace("xxx", " ");

        System.out.println(input);


    }
}
