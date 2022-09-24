//Created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main(String[]args){
        Scanner dataEntry =new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String kata3=" ";

        System.out.print("Masukan kata-1:");
        String kata1 =dataEntry.nextLine();

        System.out.print("Masukan kata-2:");
        String kata2 =dataEntry.nextLine();

        try{
            System.out.print("Masukan kata-3:");
            kata3= input.readLine();
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        System.out.println(kata1+ " " + kata2 + " " + kata3);
    }
}