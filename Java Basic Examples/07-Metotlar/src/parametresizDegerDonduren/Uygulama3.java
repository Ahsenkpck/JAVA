package parametresizDegerDonduren;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class Uygulama3 {

    public static void main(String[] args) {

        String gelen = adsoyadal();
        System.out.println("Hoşgeldin " + gelen);

    }

    public static String adsoyadal() {
        Scanner sc = new Scanner(System.in);

        String ad;
        String soyad;

        System.out.println("Adınızı giriniz:");
        ad = sc.next();
        System.out.println("Soyadınızı giriniz:");
        soyad = sc.next();
        return ad + soyad;

    }
}
