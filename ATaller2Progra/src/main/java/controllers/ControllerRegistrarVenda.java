
package controllers;

import dao.VendedorDao;
import dao.VentaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;
import vista.VistAregregarVenta;


public class ControllerRegistrarVenda implements ActionListener {
    private VistAregregarVenta vAgregar;

    public ControllerRegistrarVenda(VistAregregarVenta vAgregar) {
        this.vAgregar = vAgregar;
        this.vAgregar.getBtnRegister().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Vendedor vendedor= (Vendedor)vAgregar.getjComboBoxVendedores().getSelectedItem();
        String sucursal=vAgregar.getjComboBoxSucursal().getSelectedItem().toString();
        String fecha=vAgregar.getTffecha().getText();
        int monto=Integer.parseInt(vAgregar.getTfMonto().getText());
        
        VentaDao v=new VentaDao();
//        VendedorDao v2=new VendedorDao();
//        
//        ArrayList<Vendedor> vende=v2.getVendedores();

        Venta v3=new Venta(sucursal,monto,fecha,vendedor.getIdVendedor());
        v.insertVenta(v3);
        
        
        
        
        
    }
    
    
}
