package soal2pert4;

import java.util.Scanner;

public class Soal2Pert4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        if (batasAwal > batasAkhir) {
            System.out.println("Batas awal harus kurang dari atau sama dengan batas akhir.");
        } else {
            int jumlahGanjil = 0;
            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (i % 2 != 0) {
                    jumlahGanjil++;
                }
            }
            System.out.println("Banyaknya bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah " + jumlahGanjil);
        }
        
        input.close();

        
    }
}
    
