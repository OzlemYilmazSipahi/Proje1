import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6;
        System.out.println("Not Ortalamanız: " + sonuc);
        int gecmeNotu = 60;
        boolean kosul = sonuc >= gecmeNotu;
        String str = kosul ? "Geçtiniz" : "Geçemediniz";
        System.out.println(str);






    }
}
