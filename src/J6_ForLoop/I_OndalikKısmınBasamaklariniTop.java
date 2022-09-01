package J6_ForLoop;

public class I_OndalikKısmınBasamaklariniTop {
    public static void main(String[] args) {

        //Ondalik kismin basamaklarinin toplamini bul
        double d=23.1528;
        String sd=String.valueOf(d);
        int idx=sd.indexOf(".")+1;
        String decimalPart=sd.substring(idx);
        int decimalPartInt=Integer.valueOf(decimalPart);
        int sumOfDigits=0;
        for (int i = decimalPartInt; i >0 ; i/=10) {
                sumOfDigits+=i%10;
        }
        System.out.println(sumOfDigits);





    }
}
