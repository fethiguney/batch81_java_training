package Proje.ucusProjesi;

import static Proje.ucusProjesi.Method.ucus;

public class UcusProjesi {
    public static void main(String[] args) {




            Yolcu yolcu1=new Yolcu("B", "gd", 36, "Fethi");
            Method.ucus(yolcu1.getIsim(), yolcu1.getSehir(), yolcu1.getUcusTipi(), yolcu1.getYas());


    }
}
