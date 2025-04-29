/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg701;

/**
 *
 * @author ZeroIchiro0
 * Selasa, 29 April 2025
 */
public class Mahasiswa {
    private String NIM, NAMA;
    
    public void datamhs(){
        System.out.println("Menampilkan Data Mahasiswa");
    }
    
    public void datamhs(String NIMs){
        this.NIM = NIMs;
        System.out.printf("Data Mahasiswa dengan NIM %s\n",this.NIM);
    }
    
    public void datamhs(String NIMs, String NAMAs){
        this.NIM = NIMs;
        this.NAMA = NAMAs;
        System.out.printf("Data Mahasiswa dengan NIM %s adalah %s\n", this.NIM, this.NAMA);
    }
}
