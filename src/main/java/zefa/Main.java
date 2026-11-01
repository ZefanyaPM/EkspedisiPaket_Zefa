/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zefa;

import java.util.List;
import zefa.layanan.LayananEkonomi;
import zefa.layanan.LayananPengiriman;
import zefa.layanan.LayananReguler;
import zefa.repository.RiwayatArrayList;
import zefa.repository.RiwayatRepository;
import zefa.service.PengirimanService;
import zefa.view.FormPengiriman;

/**
 *
 * @author Zefa
 */
public class Main {
    public static void main(String[] args) {
        RiwayatRepository repository = new RiwayatArrayList();
        PengirimanService service = new PengirimanService(repository);
        
        List<LayananPengiriman> daftarLayanan = List.of(
                new LayananReguler(),
                new LayananEkonomi()
        );
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            //logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            FormPengiriman form = new FormPengiriman(service, daftarLayanan);
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        });
    }
}
