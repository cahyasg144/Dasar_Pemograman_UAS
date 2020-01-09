/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3b_konversijammenitdetik;

/**
 *
 * @author user  Nama    : Cahya Satria Gumelar
 *               Kelas   : TI-1A
 *               NIM     : A2.1900028
 *               Prodi   : Teknik Informatika
 *               Program : Nilai Konversi jam Menit Detik ke Total Detik
 */
public class Soal3b_KonversiJamMenitDetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        int jam = 2, menit = 50, detik = 35;
        int total_detik;
        
        total_detik = jam*3600+menit*60+detik;
        
        System.out.println("Nilai Jam = "+ jam);

 System.out.println("Nilai Menit = "+ menit);
 
 System.out.println("Nilai Jam = "+ detik);

 System.out.println("Jumlah Konversi diatas adalah " + total_detik);
 
    }
    
}
