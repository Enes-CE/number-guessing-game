import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  //0-1000 arası

        int kisi_sayi;
        int pc_sayi = random.nextInt(10);  //0-10 arası random sayı atacak. Siz bu sayıyı arttırabilirsiniz...
        int toplam_puan = 100;
        int hak = 5;
        int sayac = 1;  // Buradaki sayac tahmini doğru bildiğimizde kaçıncı adımda bildiğimizi bize söyleyecek


        System.out.println("****************************************");
        System.out.println("# Sayi Tahmin Uygulamasına Hoşgeldiniz #");
        System.out.println("****************************************");

        System.out.print("Lütfen sayınızı giriniz : ");
        kisi_sayi = scanner.nextInt();

        while (true) {

            if (kisi_sayi == pc_sayi) {
                System.out.println("Tebrikler! " + sayac + ". Adımda Doğru Tahmin Ettiniz...");
                break;

            }
            if (kisi_sayi > pc_sayi) {

                hak--;
                toplam_puan -= 20;

                System.out.println("--------------------------------");
                System.out.println("Kalan hakkınız : " + hak);
                System.out.println("Toplam puanınız : " + toplam_puan);
                System.out.println("--------------------------------");

                System.out.print("!!!UYARI!!! Tekrar deneyiniz ve  daha KÜÇÜK sayı giriniz : ");
                kisi_sayi = scanner.nextInt();
                System.out.println();
                sayac++;

            }
            if (pc_sayi > kisi_sayi) {

                hak--;
                toplam_puan -= 20;

                System.out.println("--------------------------------");
                System.out.println("Kalan hakkınız : " + hak);
                System.out.println("Toplam puanınız : " + toplam_puan);
                System.out.println("--------------------------------");


                System.out.print("!!!UYARI!!! Tekrar deneyiniz ve  daha büyük sayı giriniz : ");
                kisi_sayi = scanner.nextInt();
                sayac++;
            }
        }
        System.out.println("Toplam puanınız : " + toplam_puan);

        //System.out.println("Bilgisayarın Tuttuğu Sayı : " + pc_sayi); Bilgisayarın tuttuğu sayıyı ayrıca görmek isterseniz bu kodu ekleyebilirsiniz.
    }
}
