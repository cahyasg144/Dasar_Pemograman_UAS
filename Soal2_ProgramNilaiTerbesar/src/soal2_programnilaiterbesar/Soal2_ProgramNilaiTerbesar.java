/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2_programnilaiterbesar;

/**
 *
 * @author user               Nama    : Cahya Satria Gumelar
 *                            Kelas   : TI-1A
 *                            NIM     : A2.1900028
 *                            Prodi   : Teknik Informatika
 *                            Program : Nilai Terbesar 3 Angka
 */
public class Soal2_ProgramNilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 1, z = 20;
 int max; 
 System.out.println("Number 1 = "+x);

 System.out.println("Number 2 = "+y);

 System.out.println("Number 3 = "+z);

  

 //mencari nilai tertinggi dengan operator kondisi

 max=(y>=x)? y: x;

 max=(z>=max)? z: max;

 System.out.println("Nilai tertinggi dari angka diatas adalah angka = "+max);


    }
    
}
