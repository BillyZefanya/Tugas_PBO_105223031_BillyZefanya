import java.util.Scanner;
public class Basic1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nama Mahasiswa : ");
        String nama = sc.nextLine();
        System.out.println("Masukan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        System.out.println("Masukan Usia Anda : ");
        int usia = sc.nextInt();
        System.out.println("Masukan Tinggi Badan Anda : ");  
        double tinggi = sc.nextDouble();

        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM Mahasiswa : " + nim);   
        System.out.println("Usia Anda : " + usia + " tahun");
        System.out.println("Tinggi Badan Anda : " + tinggi + " cm");                        

        int aritMat = ( (usia*2) + 10/5-3);
        System.out.println("Hasil Aritmatika : " + aritMat);
        
        if (usia > 18) {
            System.out.println("Usia Anda lebih dari 18 tahun");
            System.out.println(true);
        } else {    
            System.out.println("Usia Anda kurang dari atau sama dengan 18 tahun");
            System.out.println(false);
        }

       if (usia > 18 && tinggi > 160) {
            System.out.println("Usia Anda lebih dari 18 tahun dan tinggi badan Anda lebih dari 160 cm");
            System.out.println(true);
        } else {    
            System.out.println("Usia Anda kurang dari atau sama dengan 18 tahun dan tinggi badan Anda kurang dari atau sama dengan 160 cm");
            System.out.println(false);
        }
        
        double usiaDouble =  (double) usia;
        System.out.println("Konversi Usia int ke double : " + usiaDouble);
        int tinggiInt = (int) tinggi;
        System.out.println("Konversi Tinggi double ke int : " + tinggiInt);      

    }
}
