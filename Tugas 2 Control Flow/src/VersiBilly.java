//https://github.com/BillyZefanya/Tugas_PBO_105223031_BillyZefanya//

import java.util.Scanner;

public class VersiBilly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlah];

        for (int i = 0; i < jumlah; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int jumlahNilai = input.nextInt();

            if (jumlahNilai < 0 || jumlahNilai > 100) {
                System.out.println("nilai tidak valid, masukkan nilai antara 0 sampai 100");
                i--; //kembali lagi ke iterasi sebelumnya untuk memasukkan nilai yang valid//
            } else {
                nilaiMahasiswa[i] = jumlahNilai;
            }
        }

        input.close();

        //Hasil Analisis//
        System.out.println("");    
        System.out.println("Hasl Analisis:");
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] > 75){
                System.out.println("Mahasiswa ke " + (i + 1)+ " " + nilaiMahasiswa[i] + " (Lulus)");
            } else {
                System.out.println("Mahasiswa ke " + (i +1) + " " + nilaiMahasiswa[i] + " (Tidak Lulus)");
            }
        }
        System.out.println("");
        //Nilai Rata-rata//
        int totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
            totalNilai = totalNilai + nilaiMahasiswa[i];
        }
        double rataRata = (double) totalNilai / jumlah;
        System.out.println("Nilai Rata-rata: " + rataRata);

        //nilai tertinggi//
        int nilaiTertinggi = nilaiMahasiswa[0];
        for (int i =0; i < jumlah; i++) {
            if (nilaiMahasiswa[i]>nilaiTertinggi){
                nilaiTertinggi = nilaiMahasiswa[i];
            }
        }
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);

       //nilai terendah//
       int nilaiTerendah = nilaiMahasiswa[0];
         for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("Nilai Terendah: " + nilaiTerendah);


        //jumlah mahasiswa yang lulus//
        int jumlahLulus = 0;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] > 75) {
                jumlahLulus = jumlahLulus + 1;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);

        //jumlah mahasiswa yang di atas rata-rata//
        int jumlahDiAtasRataRata = 0;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] > rataRata) {
                jumlahDiAtasRataRata = jumlahDiAtasRataRata + 1;
            }
        }
        System.out.println("Jumlah mahasiswa yang di atas rata-rata: " + jumlahDiAtasRataRata);
    }
}