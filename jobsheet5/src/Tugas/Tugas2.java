//Created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        String kata1 = "", kata2 = "", kata3 = "";
        
        kata1 = JOptionPane.showInputDialog("Masukan kata 1 :");
        kata2 = JOptionPane.showInputDialog("Masukan kata 2 :");
        kata3 = JOptionPane.showInputDialog("Masukan kata 3 :");

    String msg = " " + kata1 +" " + kata2 + " " + kata3;

    JOptionPane.showMessageDialog(null, msg);

    System.out.println(kata1 + kata2 + kata3);
}       
}
