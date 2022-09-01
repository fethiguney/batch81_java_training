package J6_ForLoop;

public class R_TekrarEdenKarakterSayisiBul {
    public static void main(String[] args) {


        String s="AAABBCDDCDC";
        int distinct = 0 ;



        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j)){
                    distinct++;


                }
            }

            System.out.print(s.charAt(i)+""+distinct);
            String d=String.valueOf(s.charAt(i)).trim();
            s=s.replaceAll(d,"");
            distinct = 0;

        }



    }
}
