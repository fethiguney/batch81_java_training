package J4_stringManipulations;

public class Soru5 {
    public static void main(String[] args) {

        //Kullanıcıdan dort harfli bir kelime isteyin
        //kelimeyi tersten yazdirin

        String input = "lake";

        System.out.println(input.charAt(input.length() - 1) +
                "" + input.charAt(input.length() - 2) +
                "" + input.charAt(input.length() - 3) +
                "" + input.charAt(input.length() - 4));

        System.out.println(input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1));

    }
}
