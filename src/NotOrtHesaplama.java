import  java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args) {
        // Değişkenleri Oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner Sınıfını Tanımla
        Scanner inp= new Scanner(System.in);

        // Kullanıcıdan Değerleri Al
        System.out.println("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunu Giriniz: ");
        fizik=inp.nextInt();

        System.out.println("Kimya Notunu Giriniz: ");
        kimya=inp.nextInt();

        System.out.println("Türkçe Notunu Giriniz: ");
        turkce=inp.nextInt();

        System.out.println("Tarih Notunu Giriniz: ");
        tarih=inp.nextInt();

        System.out.println("Müzik Notunu Giriniz: ");
        muzik=inp.nextInt();

        double ortalama=(mat+ fizik+ kimya+ turkce+ tarih+ muzik)/7;
        System.out.println("Ortalamanız: "+ortalama);
    }
}
