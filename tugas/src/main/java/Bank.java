/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUHAMMAD FIRMAN
 */
public class Bank {
    int Mysaldo;
    int total;
     public Bank(int saldo){
         Mysaldo = saldo;
     }
      void getSaldo(){
          
          System.out.println("selamat Datang di Bank VMN");
          System.out.println("Saldo saat ini: "+Mysaldo);
            System.out.println("--------------------------");
      }
      void simpanuang (int Simpan){
          total = Simpan + Mysaldo;
          
          System.out.println("Simpan Uang: "+Simpan);
          System.out.println("Saldo saat ini: "+"Rp."+ total);
          System.out.println("-------------------------");
          
      }
      void ambilUang(int ambil){
          int totalsaldo = total - ambil;
          
          System.out.println ("Ambil uang: "+ambil);
          System.out.println ("Saldo saat ini: "+"Rp."+totalsaldo);
          System.out.println("----------------------------");
          
          
      }
}



