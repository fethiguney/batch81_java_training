package J4_stringManipulations;

public class lenght {
    public static void main(String[] args) {


        String str="Bugun java ogrenmek icin guzel bir gun";

        int strLenght=str.length();
        System.out.println(strLenght);

        int strLastIndex=str.lastIndexOf("gun");
        System.out.println(strLastIndex);


        char  lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

    }
}
