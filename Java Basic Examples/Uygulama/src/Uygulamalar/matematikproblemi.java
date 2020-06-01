package Uygulamalar;

import java.util.Scanner;

/**
 *
 * @author akipc
 */
public class matematikproblemi {

    public static void main(String[] args) {
        /*
        Matematik problemi:
        Bir F(x,y) fonksiyonunu klavyeden girilen değerler için hesaplayalım
        x>0, y>0 F(x,y)=x^2+y^2+2xy+5
        x<0, y>0 F(x,y)=2*x*y+150
        x>0, y<0 F(x,y)=2*x+5*y+10
         */

        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double sonuc;
        System.out.print("Klavyeden x değerini giriniz:");
        x = scan.nextDouble();
        System.out.print("Klavyeden y değerini giriniz:");
        y = scan.nextDouble();

        if (x > 0 && y > 0) {
            sonuc = x * x + y * y + 2 * x * y + 5;
        } else if (x < 0 && y > 0) {
            sonuc = 2 * x * y + 150;
        } else if (x > 0 && y < 0) {
            sonuc = 2 * x + 5 * y + 10;

        } else {

            System.out.println("Girdiğiniz x ve y değerleri probleme uygun değil:");
            sonuc = 0;
        }
        System.out.println("Sonuç değeriniz:" + sonuc);

    }
}
