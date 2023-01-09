import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam =0,dersSayisi=0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat =  input.nextInt();
        if ((mat >0) && (mat<=100)){
            toplam += mat;
            dersSayisi++;
        }


        System.out.print("Fizik Notunu Giriniz : ");
        fizik =  input.nextInt();
        if ((fizik >0) && (fizik<=100)){
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe Notunu Giriniz : ");
        turkce =  input.nextInt();
        if ((turkce >0) && (turkce<=100)){
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya Notunu Giriniz : ");
        kimya =  input.nextInt();
        if ((kimya >0) && (kimya<=100)){
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik Notunu Giriniz : ");
        muzik =  input.nextInt();
        if ((muzik >0) && (muzik<=100)){
            toplam += muzik;
            dersSayisi++;
        }

        ortalama = toplam/dersSayisi;

        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz");
        }
        else {
            System.out.println("Sınıfta kaldınız");
        }

        System.out.print("Ortalamanız : " + ortalama);

    }
}
