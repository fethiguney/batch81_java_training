package J4_stringManipulations;

public class LastIndexOf {
    public static void main(String[] args) {

        String str="Bugun java ogrenmek icin guzel bir gun";


        char  lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);


        int searchGun=str.lastIndexOf("gun");

        if (searchGun>=0) {
            System.out.println("Cumlede gun geciyor");
        } else {
            System.out.println("Cumlede gun gecmiyor");
        }

    }
}
