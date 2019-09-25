/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan5.kambingglobal;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : Program ini berisi program yang menampilkan jumlah
 * kambing global

 */
public class IF110118038Latihan5KambingGlobal {
    
    //Variabel jumlahkambing menjadi variabel instance
        
        int jumlahKambing = 88;
        
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah:" + jumlahKambing); 
    }
    
    public static void main(String[] args) {
        IF110118038Latihan5KambingGlobal kambingSusu = new 
        IF110118038Latihan5KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
