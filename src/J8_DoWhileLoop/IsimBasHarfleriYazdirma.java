package J8_DoWhileLoop;

public class IsimBasHarfleriYazdirma {
    public static void main(String[] args) {

        String isim="Mustafa Kemal Can Aran";

        String [] isimKelimeleri=isim.split(" ");
        String isimBasHarfler="";
        for (int i = 0; i < isimKelimeleri.length ; i++) {
            isimBasHarfler+= isimKelimeleri[i].substring(0,1).toUpperCase()+".";
        }
        System.out.println(isimBasHarfler);


        String basHarfler=isim.substring(0,1)+".";
        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==' ') {
                basHarfler+=isim.charAt(i+1)+".";
            }
        }
        System.out.println(basHarfler);


    }
}
