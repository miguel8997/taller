
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Venta;


public class VentaDao {
    
    
    private Conexion con;

    public VentaDao() {
        this.con = new Conexion();
    }

    public ArrayList<Venta> getGastosByIdCuenta(int idVendedor){
        
        ArrayList<Venta> ventas=new ArrayList<>();
         String sql = "SELECT * FROM venta WHERE id_vendedor="+idVendedor;
         CuentaDao cDAO = new CuentaDao();

        try {
            Connection accesoBD = con.getConexion();
            Statement st = accesoBD.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                int idVenta = rs.getInt("id_venta");
                String sucursal = rs.getString("sucursal");
                int monto = rs.getInt("monto");
                String fecha=rs.getString("fecha");
                int id_Vendedor = rs.getInt("id_vendedor");
                
//                Cuenta c = cDAO.getById(id_cuenta);
                
                ventas.add( new Venta(idVenta, sucursal, monto,fecha,id_Vendedor));
                

            }
            return ventas;
            
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }
    
        public void insertVenta(Venta c){  //agrega
        
        Connection accesoBD=con.getConexion();
        
        try{
            String sql="INSERT INTO venta (sucursal,monto,fecha,id_vendedor)" 
                        + "VALUES ('"+c.getSucursal()+"',"+c.getMonto()
                        +",'"+c.getFecha()+"',"+c.getIdVendedor()+")";
            
            Statement st=accesoBD.createStatement();
            st.executeUpdate(sql);
            
        }catch(Exception e){
            System.out.println("Error al insertar la cuenta");
            e.printStackTrace();
        }
        
    }
    
    
}
