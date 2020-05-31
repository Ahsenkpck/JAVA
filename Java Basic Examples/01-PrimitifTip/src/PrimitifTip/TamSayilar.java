package PrimitifTip;

/**
 *
 * @author akipc
 */
public class TamSayilar {

    public static void main(String[] args) {
        /*
        *Tam Sayılar->byte, short, int, long
        *Ondalık Syılar->float,double
        *Tek Karakter->char(a,b,8,^,&)        
        *Durum boolean->true,false             
         */
        //byte->byte hafızada 8 bitlik bir alan kaplar.-128 ile +128 arasında bir değer alır
        //primitif tipler hafızada belitldiği alan kadar yer tutar
        byte bsayi = 15;

        //short->hafızada 16 bitlik bir alan kaolar.-2^15 ile +2^15 arsında bir yer kaplar.
        short ssayi = 25;

        //int->hafızada 32 bitlik bir alan kaplar.-2^31 ile +2^31 arasında yer kaplar.
        int isayi = 220;
        //long->long hafızada 64  bitlik bir alan kaplar.-2^63 ile +2^63 arasında bir alan kaplar.yaklaşık 2 mlyarlk bir alan
        long longsayi = 2876;
        System.out.println("isayinin değeri:" + isayi);
        System.out.println("bsayinin değeri:" + bsayi);
        System.out.println("longsayi nin değeri:" + longsayi);

    }

}
