import java.util.Scanner;
public class PemilihanPercobaan215 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Nilai uas  : ");
        float uas = input15.nextFloat();
        System.out.print("Nilai uts  : ");
        float uts = input15.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input15.nextFloat();
        System.out.print("Nilai tugas: ");
        float tugas = input15.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (80 < total && total <= 100) {
            System.out.println("Nilai huruf anda = A \nnilai setara anda = 4 \nKualifikasi anda Sangat baik.");
        }
        else if (73 < total && total <= 80) {
            System.out.println("Nilai huruf anda B+ \nnilai setara anda = 3.5 \nKualifikasi anda Lebih dari baik.");
        }
        else if (65 < total && total <= 73) {
            System.out.println("Nilai huruf anda B \nnilai setara anda = 3 \nKualifikasi anda baik.");
        }
        else if (60 < total && total <= 65) {
            System.out.println("Nilai huruf anda C+ \nnilai setara anda = 2,5 \nKualifikasi anda lebih dari cukup.");
        }
        else if (50 < total && total <= 60) {
            System.out.println("Nilai huruf anda C \nnilai setara anda = 2 \nKualifikasi anda cukup.");
        }
        else if (39 < total && total <= 50) {
            System.out.println("Nilai huruf anda D \nnilai setara anda = 1 \nKualifikasi anda kurang.");
        }
        else if (0 < total && total <= 39) {
            System.out.println("Nilai huruf anda E \nnilai setara anda = 0 \nKualifikasi anda Gagal.");
        }
        else {
            System.out.println("Terjadi kesalahan");
        }
        String message = total< 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }

}