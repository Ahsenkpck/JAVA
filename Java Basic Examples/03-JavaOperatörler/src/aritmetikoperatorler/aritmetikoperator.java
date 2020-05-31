package aritmetikoperatorler;

/**
 *
 * @author akipc
 */
public class aritmetikoperator {

    public static void main(String[] args) {
        //= atama operatörü
        int sayi1 = 26;
        int sayi2 = 15;
        int toplam = sayi1 + sayi2;
        //+ toplama operatörü ama her zaman değil.birleştirme için de kullanılır string ifadelerinde
        int çıkarma = sayi1 - sayi2;
        //- çıkarma operatörü
        int carpma = sayi1 * sayi2;
        //* çarpma operatörü
        int bolme = sayi1 / sayi2;
        float bolmef = (float) sayi1 / sayi2;

        int mod = sayi1 % sayi2;

        System.out.println("toplama sonucu:" + toplam);
        System.out.println("çıkarma sonucu:" + çıkarma);
        System.out.println("çarpma sonucu:" + carpma);
        System.out.println("bölme sonucu:" + bolme);
        System.out.println("float bölme sonucu:" + bolmef);
        System.out.println("mod:" + mod);
    }
}
