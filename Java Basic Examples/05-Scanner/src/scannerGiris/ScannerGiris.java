package scannerGiris;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class ScannerGiris {

    public static void main(String[] args) {
        /* String isim = "Ahsen";
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("String giriniz:");
        String yazı = scan.next();
        System.out.println("String değeri:"+yazı);
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("İsminizi giriniz:");
        String isim = scan.next();
        System.out.print("Bir sayı giriniz:");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayı daha giriniz:");
        int sayi2 = scan.nextInt();
        System.out.println("Merhaba " + isim);
        int sonuc = sayi1 + sayi2;
        System.out.println("Toplama Sonucunuz:" + sonuc);

    }
}
