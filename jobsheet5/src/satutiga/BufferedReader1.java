//created by 21343058_Muhammad Farel Fahlevi

package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");

        try{
            System.out.println("Masukan angka pertama :");
            a = dataIn.readLine();
            /*data yagn akan diproses aritmatika harus dikonversikan dulu
             * dari tipe data string ke tipe data angka yang diperlukan
             * data yang diperoleh dari inputan kelas BufferedReader 
             * tipe datanya selalu String
             */
            angka1 = Float.parseFloat(a);

            System.out.print("Masukan angka kedua : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
    }
}
