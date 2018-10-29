/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan62_livingthing;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan makhluk 
 *                     hidup dengan konsep abstract
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama){
        System.out.println("Bernafas"); 
    }
    public void eat (String nama){
        System.out.println("Makan");
        
    }
}
