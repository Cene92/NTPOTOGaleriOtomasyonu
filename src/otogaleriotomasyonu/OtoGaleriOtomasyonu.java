/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otogaleriotomasyonu;
import java.sql.*;
/**
 *
 * @author aysel
 */
public class OtoGaleriOtomasyonu {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Arayüz a = new Arayüz();
          Deneme deneme = new Deneme();
          VeriTabaniIslemleri veriTabani= new VeriTabaniIslemleri();
          veriTabani.Baglan();
          veriTabani.VerileriEkle();
          veriTabani.VerileriGetir();

    }
    
}
