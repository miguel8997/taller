
package modelo;

import dao.VendedorDao;
import java.util.ArrayList;
import vista.VistMenu;

public class NewMain {

    public static void main(String[] args) {
        
        VendedorDao v=new VendedorDao();
//        Vendedor v1=v.getById(2);
//        
//        
//        System.out.println(v1.getNombre());
//        System.out.println(v1.getVentas().get(0).getSucursal());
//        ArrayList<Vendedor> v1=v.getVendedores();
//        
//        System.out.println(v1.get(0).getApellido());
//        System.out.println(v1.get(1).getApellido());

        VistMenu v1=new VistMenu();
        v1.setVisible(true);
        
        
        
       
    }
    
}
