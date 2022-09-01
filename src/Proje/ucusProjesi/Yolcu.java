package Proje.ucusProjesi;

public class Yolcu {

    private String sehir;

    private String ucusTipi;

    private int yas;

    private String isim;

    public Yolcu(String sehir, String ucusTipi, int yas, String isim) {
        this.sehir = sehir;
        this.ucusTipi = ucusTipi;
        this.yas = yas;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Yolcu Bilgileri "+"\n"+
                "sehir : " + sehir + "\n" +
                "ucusTipi : " + ucusTipi + "\n" +
                "yas : " + yas + "\n"+
                "isim : " + isim;

    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUcusTipi() {
        return ucusTipi;
    }

    public void setUcusTipi(String ucusTipi) {
        this.ucusTipi = ucusTipi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
