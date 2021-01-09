
package latihanPBO;
import java.util.Scanner;

public class praktikum1 {


    public static void main(String[] args) {
        double r, hasil;    //mendeklarasiakan jari jari dan hasil  operasi luas permukaan
        
        Scanner input = new Scanner(System.in); //membuat Scanner baru
        System.out.println("=== menghitung luas permukaan bola =="); //menampilkan kalimat
        System.out.println("masukan nilai jari : "); // menampilkan kalimat yang menyuruh untuk memasukan nilai jari jari
        
        r = input.nextDouble(); //mengisi variabel jari jari dari inputan keyborad melaluli scanner
        
        hasil = 4*Math.PI*r; // melakukan operasi hitung dengan nilai pi di dapat dari method Math.PI
        
        System.out.println("luas permukaan bola adalah :\n"+hasil); // menampilkan kalimat dan hasil operasi
    }
    
}
