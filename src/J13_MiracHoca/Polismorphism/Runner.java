package J13_MiracHoca.Polismorphism;

public class Runner {

    public static void main(String[] args) {
        Civciv civciv1=new Civciv();//o
        Ordek ordek1=new Ordek();// bje olusturduk
        hayvanSesCikar(ordek1);
        hayvanSesCikar(civciv1);
    }
    public static void hayvanSesCikar(Animal animal){
        animal.sesiCikar();

    }
}
