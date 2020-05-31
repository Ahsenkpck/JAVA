package StringSayiDonusumu;

/**
 *
 * @author akipc
 */
public class TipDonusum2 {

    public static void main(String[] args) {
        String sayi1 = "15";
        String sayi2 = "52";

        int sayid1 = Integer.parseInt(sayi1);//string değerini int e donusturuyor
        int sayid2 = Integer.parseInt(sayi2);

        int toplam = sayid1 + sayid2;
        System.out.println("1.toplam değeri:" + toplam);

        int sayi3donusum = Integer.valueOf(sayi1);
        int sayi4donusum = Integer.valueOf(sayi2);
        int toplam2 = sayi3donusum + sayi4donusum;
        System.out.println("2.toplam değeri:" + toplam2);

        float sayidonf = Float.valueOf(sayi1);
        float sayidonf2 = Float.parseFloat(sayi2);
        float toplam3 = sayidonf + sayidonf2;
        System.out.println("Float sayi toplamı:" + toplam3);

        double sayidond = Double.valueOf(sayi1);
        double sayidond2 = Double.parseDouble(sayi2);
        double toplam4 = sayidond + sayidond2;
        System.out.println("Double sayi toplamı:" + toplam4);
    }
}
