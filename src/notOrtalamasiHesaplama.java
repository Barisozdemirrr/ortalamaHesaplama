import java.util.Scanner;

public class notOrtalamasiHesaplama {


    public static void main(String[] args) {
    int mat, fizik , kimya , turkce , tarih ,muzik;

    Scanner scan = new Scanner(System.in);

    System.out.print("Matematik Notunuz : ");
    mat = scan.nextInt();
    System.out.print("Fizik Notunuz : ");
    fizik = scan.nextInt();
    System.out.print("Kimya Notunuz : ");
    kimya = scan.nextInt();
    System.out.print("Türkçe Notunuz : ");
    turkce = scan.nextInt();
    System.out.print("Tarih Notunuz : ");
    tarih = scan.nextInt();
    System.out.print("Müzik Notunuz : ");
    muzik = scan.nextInt();
    int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
    double sonuc = toplam/6.0;

        String gecmeDurumu = sonuc >=60 ? "Tebrikler, Sınıfı Geçtiniz." : "Sınıfta Kaldınız !";

        System.out.println("Ortalamanız: "+sonuc);
        System.out.println(gecmeDurumu);


    }
}