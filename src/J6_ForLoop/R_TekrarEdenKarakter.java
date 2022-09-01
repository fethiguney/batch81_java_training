package J6_ForLoop;

public class R_TekrarEdenKarakter {
    public static void main(String[] args) {
        String cumle = "Javaisalsoeasy";
        String tekrarEdenKarakterler="";

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.indexOf(cumle.charAt(i))!=cumle.lastIndexOf(cumle.charAt(i))) {
                if (!tekrarEdenKarakterler.contains(cumle.substring(i,i+1))) {
                    tekrarEdenKarakterler+=cumle.substring(i,i+1)+" ";
                }
            }
        }
        System.out.println(tekrarEdenKarakterler);



    }
}
