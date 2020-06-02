package mathMetotlari;

/**
 *
 * @author akipc
 */
public class MathMetotlari {

    public static void main(String[] args) {
        /*
        * Math.sqrt(sayi)->Yazılan sayının kökünü alır double türünde sonuç türetir.
        * Math.ceil(sayi)->sayıyı bir üst sayıya yuvarlar
        * Math.pow(sayi,us)->Sayının üssünü alır
        * Math.max->parametrelerden büyük olanı bulur
        * Math.random->0 ile 1 arasında rastgele sayı üretir
         */
        double kök = Math.sqrt(81);
        System.out.println("sonuc:" + kök);
        double sayi = Math.ceil(5.7);
        System.out.println("sayı:" + sayi);
        double ussonuc = Math.pow(2, 4);
        System.out.println("us sonucu:" + ussonuc);
        double deger = Math.sin(90);
        System.out.println("sayinin sin değeri:" + deger);
        double max = Math.max(10, 20);
        System.out.println("max sayi:" + max);
        double min = Math.min(2, 29);
        System.out.println("min sayi:" + min);
        double randoms = Math.random();
        System.out.println("random sayi:" + randoms);
        double sayii = 1 + Math.random() + 100;//1 ile 100 arasında sayı üretir
        System.out.println("random sayi:" + sayii);
    }

}
