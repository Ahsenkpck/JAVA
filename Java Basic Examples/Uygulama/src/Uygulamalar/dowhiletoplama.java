package Uygulamalar;

/**
 *
 * @author akipc
 */
public class dowhiletoplama {

    public static void main(String[] args) {
        /* int a = 0;
        int toplam = 0;
        do {
            toplam += a;
            a++;

        } while (a <= 50);
        System.out.println("toplam sonucu:" + toplam);
         */

        //primitif tiplerden sayı olanların başlangıç değerleri 0 dır.boolean ın başlangıç değeri false dir
        int toplam = 0;
        for (int i = 0; i <= 100; i++) {
            toplam += i;

        }
        System.out.println("toplam sonucu:" + toplam);

    }
}
