package soal1pert4;

import java.util.Scanner;

public class Soal1Pert4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
            // Menampilkan bilangan dari 1 hingga n
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        
        
        input.close(); // Menutup scanner untuk mencegah memory leak

    }
    
}
