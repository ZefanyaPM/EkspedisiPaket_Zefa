/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zefa.repository;

import java.util.List;
import zefa.model.Pengiriman;

/**
 *
 * @author Zefa
 */
public interface RiwayatRepository {
    
    void simpan(Pengiriman pengiriman);
    
    List<Pengiriman> ambilSemua();
}
