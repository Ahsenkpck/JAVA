package Uygulamalar;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class VizeFinalOrtalama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vize;
        double finall;
        double ortalama;

        System.out.print("Vize notunuzu giriniz:");
        vize = scan.nextDouble();

        System.out.print("Final notunuzu giriniz:");
        finall = scan.nextDouble();

        ortalama = vize * 0.4 + finall * 0.6;
        System.out.println("Ortalamanız:" + ortalama);

        if (ortalama >= 80 && ortalama <= 100) {
            System.out.println("Harf notunuz: AA");

        } else if (ortalama >= 70 && ortalama <= 80) {

            System.out.println("Harf notunuz: BA");
        } else if (ortalama > 50 && ortalama <= 70) {
            System.out.println("Harf notunuz: CB");
        } else if (ortalama < 50) {
            System.out.println("KALDINIZ");
            System.out.println("Harf notunuz: DD");

        } else {
            System.out.println("Uygun bir harf notu bulunamadı");
        }
    }
}
