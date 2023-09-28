import java.util.Scanner;
public class PemilihanPercobaan115 {
    public static void main(String[] args) {
       Scanner input15 = new Scanner (System.in);
       System.out.println("Masukkan angka:  ");
       int angka = input15.nextInt();
       String hasil;
       hasil = (angka <=-1) ? " Bilangan negatif " : "Bilangan positif";
       System.out.println(angka + " adalah " + hasil);
    }
}   
