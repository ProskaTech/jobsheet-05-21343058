## Created by 21343058_Muhammad Farel Fahlevi
Dalam sesi lembar kerja 5 ini, saya belajar bagaimana menerapkan kelas pemindai BufferedReader, JOptionPane. 
Pada pemindai sebelum deklarasi kelas, kita harus terlebih dahulu mengimpornya menggunakan sintaks import java.util.scanner;. 
Dan mendeklarasikan menggunakan kelas pemindai menggunakan sintaks Scanner BacaInput = new Scanner(System.in); di mana BacaInput adalah variabel bertipe Scanner dan new Scanner(System.in) adalah sintaks yang dimaksudkan untuk membuat objek bertipe Scanner. 
Di BufferedReader sebelum deklarasi kelas, kita harus terlebih dahulu mengimpornya menggunakan sintaks import java.io.BufferedReader;, java.io.InputStreamReader; dan java.io.IOException;. 
Dan mendeklarasikan menggunakan kelas BufferedReader menggunakan sintaks BufferedReader DataInput = new BufferedReader (new InputStreamReader(System.in)); 
setelah mendeklarasikannya membutuhkan metode Name = DataEnter.readLine(); untuk membaca input dari keyboard. 
Pada JOptionPane sebelum deklarasi class kita harus mengimportnya terlebih dahulu dengan syntax import javax.swing.JOptionPane; 
dan untuk mendeklarasikan penggunaan kelas JOptionPane menggunakan syntax Nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda"); dimana Syntax tersebut akan menampilkan dialog dengan sebuah pesan, 
sebuah texftile dan tombol OK. dan hasil dari dialog tersebut adala String dan disimpan kedalam variabel Nama kemudian untuk menampilkan pesan selanjutnya menggunakan String msg = "Hallo" + "Nama + "!" kemudian tambahkan Syntax JOptionPane.ShowMessageDialog (null, msg); syntax ini digunakan untuk menampilkan sebuah dialog yang memiliki sebuah pesan dan tombol OK.
