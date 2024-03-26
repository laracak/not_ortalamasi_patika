import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        //degiskeni olusturduk
        int mat , fizik , kimya , turkce , tarih , muzik ;
        //sınıfı tanımladık
        Scanner inp = new Scanner(System.in);

        //degerler
        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + kimya + turkce + fizik + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);

        //koşul oluşturuyoruz
        boolean ort = sonuc >= 60;
        String str = ort ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);



    }
}
