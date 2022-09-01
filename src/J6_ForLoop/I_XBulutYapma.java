package J6_ForLoop;

public class I_XBulutYapma {
    public static void main(String[] args) {


        int coloumn=5;
        int row=3;

        for (int i = 1; i <=row ; i++) {
            String s="";
            for (int j = 1; j <=coloumn ; j++) {
                    s+="X";
            }
            System.out.println(s);
        }




    }

}
