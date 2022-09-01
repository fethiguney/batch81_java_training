package J6_ForLoop;

public class I_TekKarakterBulma {
    public static void main(String[] args) {


     //  String str="Alabama";

     //  char c=str.charAt(0);
     //  for (int i = 0; i <str.length() ; i++) {
     //      if(str.indexOf(c)==str.lastIndexOf(c)) {

     //      }
     //  }System.out.print(c);

        String cumle = "Javaisalsoeasy";
        String tekrarEdenKarakterler="";
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.indexOf(cumle.substring(i,i+1))!=cumle.lastIndexOf(cumle.substring(i, i+1))) {
                if(!tekrarEdenKarakterler.contains(cumle.substring(i, i+1))){
                    tekrarEdenKarakterler+=cumle.substring(i, i+1)+" ";
                }
            }
        }
        System.out.println(tekrarEdenKarakterler);






    }
}
