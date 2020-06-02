package parametreliDegerDonduren;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class Uygulama3 {

    public static void main(String[] args) {

        String a = adsoyadal();
        //string adsoyadı bilgiyiyaz metodunda kullanıyorum
        bilgiyiyaz(a);

    }

    public static String adsoyadal() {

        Scanner scan = new Scanner(System.in);
        String ad;
        String soyad;
        System.out.print("Adınız:");
        ad = scan.next();
        System.out.print("Soyadınız:");
        soyad = scan.next();
        return ad + " " + soyad;

    }

    public static void bilgiyiyaz(String adSoyad) {

        System.out.println("Hoşgeldin," + adSoyad);

    }
}
