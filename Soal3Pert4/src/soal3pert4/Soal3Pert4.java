package soal3pert4;

import java.util.Scanner;

public class Soal3Pert4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Nilai n tidak boleh negatif.");
        } else {
            int faktorial = 1;
            String faktorialString = n + "! = ";
            for (int i = n; i >= 1; i--) {
                faktorial *= i;
                faktorialString += i;
                if (i != 1) {
                    faktorialString += " * ";
                }
            }
            System.out.println(faktorialString + " = " + faktorial);
        }
        
        input.close(); 
    }
  
}
