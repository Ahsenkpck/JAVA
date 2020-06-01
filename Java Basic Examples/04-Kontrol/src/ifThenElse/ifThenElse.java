package ifThenElse;

/**
 *
 * @author akipc
 */
public class ifThenElse {

    public static void main(String[] args) {

        int a = 13;
        int b;
        String sonuc;
        boolean durum;
        sonuc = (a > 10) ? "büyük" : "küçük";

        b = (a > 10) ? 15 : 4;   //aşağıdaki işlemleri tek satırda yapabiliriz.a 10 dan büyükse 15 değilse 4 değerini alır.

        /*int a = 13;
        int b;

        if (a > 10) {
            b = 15;
        } else {
            b = 4;
        }
         */
        durum = (a > 10) ? true : false;
        System.out.println("durum:" + durum);
        System.out.println("b nin değeri:" + b);
        System.out.println("sonuc:" + sonuc);
    }
}
