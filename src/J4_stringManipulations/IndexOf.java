package J4_stringManipulations;

public class IndexOf {
    public static void main(String[] args) {


        String str5 = "wertyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";

        // str5'de p harfi var midir ?
        if (str5.indexOf("p")>=0) {
            System.out.println("P harfi kullanilmis");
        } else {
            System.out.println("S harfi kullanilmamis");
        }

    }
}
