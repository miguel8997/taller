
package vista;

import controllers.ControllerRegistrarVenda;
import javax.swing.*;
import modelo.Vendedor;


public class VistAregregarVenta extends JFrame {

    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> jComboBoxSucursal;
    private javax.swing.JComboBox<Vendedor> jComboBoxVendedores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTextField tfMonto;
    private javax.swing.JTextField tffecha;
    
    public VistAregregarVenta() {
        lblVendedor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jComboBoxVendedores = new javax.swing.JComboBox<>();
        jComboBoxSucursal = new javax.swing.JComboBox<>();
        tffecha = new javax.swing.JTextField();
        tfMonto = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVendedor.setText("Vendedor:");

        jLabel2.setText("lblSucursal");

        lblFecha.setText("Fecha:");

        lblMonto.setText("Monto:");

        

        jComboBoxSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portal Temuco", "Centro"}));

        btnRegister.setText("Register");
        
        ControllerRegistrarVenda c=new ControllerRegistrarVenda(this);
        
        
        posicionar();
    }

    public JComboBox<Vendedor> getjComboBoxVendedores() {
        return jComboBoxVendedores;
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public JComboBox<String> getjComboBoxSucursal() {
        return jComboBoxSucursal;
    }

    public JTextField getTfMonto() {
        return tfMonto;
    }

    public JTextField getTffecha() {
        return tffecha;
    }
    
    
    
    

    private void posicionar() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMonto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblVendedor)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxVendedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tffecha)
                        .addComponent(tfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(jComboBoxVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(tffecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(tfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }
    
    
}
