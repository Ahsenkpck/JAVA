package Uygulamalar;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class arabolensayi {

    public static void main(String[] args) {
        int baslangic;
        int bitis;

        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi sayıdan başlamak istiyorsunuz:");
        baslangic = scan.nextInt();

        System.out.print("Bitiş değeriniz:");
        bitis = scan.nextInt();

        for (int i = baslangic; i < bitis; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("belirlenen aralıkta 3'e ve 4'e bölünen sayılar:" + i);
            }
        }
    }
}
