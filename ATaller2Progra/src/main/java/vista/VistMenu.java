
package vista;

import dao.VendedorDao;
import java.util.ArrayList;
import javax.swing.*;
import modelo.Vendedor;


public class VistMenu extends JFrame {
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReporte;

    public VistMenu() {
        
        btnRegistrar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setText("Registrar Venta");
        
        this.btnRegistrar.addActionListener((e) -> {
            
            VendedorDao ven=new VendedorDao();
            
            VistAregregarVenta v=new VistAregregarVenta();
            
            ArrayList<Vendedor> vendedores=ven.getVendedores();
            
            for (int i = 0; i < vendedores.size(); i++) {
                v.getjComboBoxVendedores().addItem(vendedores.get(i));
            }
            
            v.setVisible(true);
        });
        
        
        btnReporte.setText("Ver Reporte");
        posicionar();
    }

    private void posicionar() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }
    
}
