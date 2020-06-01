package ifKontrol;

/**
 *
 * @author akipc
 */
public class ififelsekontrol {

    public static void main(String[] args) {
        int ortalaması = 78;
        if (ortalaması > 80) {
            System.out.println("HARF NOTUNUZ:AA");

        } else if (ortalaması > 70) {
            System.out.println("HARF NOTUNUZ:BA");

        } else if (ortalaması > 60) {
            System.out.println("HARF NOTUNUZ:BB");

        } else {
            System.out.println("KALDINIZ");
        }

        /*char karakter1 = '$';
        char karakter2 = '&';
        if (karakter1 == karakter2) {
            System.out.println("girdiğiniz karakterler birbirine eşittir");
        }
        if (karakter1 != karakter2) {
            System.out.println("girdiğiniz karakterler birbirie eşit değildir");  
    }
         */
    }
}
