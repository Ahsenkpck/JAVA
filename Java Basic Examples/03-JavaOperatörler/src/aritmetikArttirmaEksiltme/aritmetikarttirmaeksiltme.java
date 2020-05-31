package aritmetikArttirmaEksiltme;

/**
 *
 * @author akipc
 */
public class aritmetikarttirmaeksiltme {

    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = 35;
        int sayi3 = 15, sayi4 = 5;

        int sonuc = sayi1++ + sayi2;//toplama sayının sağında yazılırsa tüm işlemler yapılır noktalı virgülü görünce atamayı yapıp sonradan sayıyı 1 arttırı.

        System.out.println("sonuc1:" + sonuc);
        int gsonuc = ++sayi3 + sayi4;//toplama sayının solunda yazılırsa sayıyı 1 arttırıp daha sonra gerekli işlemleri tamamlar.
        System.out.println("sonuc2:" + gsonuc);

        sayi1++;

        ++sayi2;

        sayi3--;

        --sayi4;

    }
}
