package J6_ForLoop;

public class I_Hafta_GunYazdirma {
    public static void main(String[] args) {

        int week=4;
        int day=7;

        for (int i = 1; i <=week ; i++) {
            System.out.println("Week : "+ i);
            for (int j = i; j <=day ; j++) {
                System.out.println(" Day : "+j);
            }
        }



    }
}
