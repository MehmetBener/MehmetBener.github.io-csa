import java.util.Scanner;

public class Yemeksepeti
{
    public static void main(String[] args)
    {
        int total = 0;
        System.out.println("Tavuk Dünyası");
        System.out.println("Merhaba");
        int teri_pesto_price = 315;
        System.out.println("Teriyaki Tavuk Full Pesto: " + teri_pesto_price + " Tl.");
        int kek_pesto_price = 340;
        System.out.println("Kekiklim Tavuk Full Pesto: " + kek_pesto_price + " Tl.");
        Scanner scanner = new Scanner(System.in);
        int more = 1;
        while (more == 1) {
            System.out.println("Hangi Ürünü İsterseniz: Teriyaki için 1, Kekiklim için 2");
            int a = scanner.nextInt();
            System.out.println("Kaç Adet istersiniz?");
            int b = scanner.nextInt();
            if (a == 1) {
                total += (teri_pesto_price * b);
            }
            if (a == 2) {
                total += (kek_pesto_price * b);
            }
            System.out.println("Başka bir şey ister misiniz? Evet için 1, Hayır için 2");
            more = scanner.nextInt();
        }
        System.out.println("Fiyat: " + total + " TL");
        System.out.println("Hangi ödeme yöntemi ile ödemek istersiniz?");
        System.out.println("Kredi Kartı için 1");
        System.out.println("Kapıda Kredi Kartı için 2");
        System.out.println("Nakit için 3");
        int payment = scanner.nextInt();
        System.out.println("Siparişiniz için teşekkürler.");
    }
}
