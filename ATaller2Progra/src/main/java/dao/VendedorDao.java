package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;

public class VendedorDao {

    private Conexion con;

    public VendedorDao() {
        this.con = new Conexion();
    }

    public Vendedor getById(int id_vendedor) {

        Vendedor v = null;

        // SELECT * FROM cuenta WHERE id=0;
        String sql = "SELECT * FROM vendedor WHERE id_vendedor=" + id_vendedor;
        VentaDao gDao = new VentaDao();
        try {
            Connection accesoBD = con.getConexion();
            Statement st = accesoBD.createStatement();

            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                int idVendedor = rs.getInt("id_vendedor");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String rut = rs.getString("rut");

                ArrayList<Venta> ventas = gDao.getGastosByIdCuenta(idVendedor);

                v = new Vendedor(idVendedor, nombre, apellido, rut, ventas);

                return v;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }
    
     public ArrayList<Vendedor> getVendedores() {  //busca todas

        ArrayList<Vendedor> Vendedores = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor";
            VentaDao gDao = new VentaDao();
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                
                int idVendedor = rs.getInt("id_vendedor");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String rut = rs.getString("rut");
                
                ArrayList<Venta> ventas = gDao.getGastosByIdCuenta(idVendedor);
                
                Vendedores.add(new Vendedor(idVendedor, nombre, apellido, rut, ventas));
            }
            
            return Vendedores;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }

//    public void MostrarInfo(int id) {
//
//        for (Vendedor v : getById(id)) {
//            System.out.println("tipo: " + p.getTipo());
//            System.out.println("dinero : " + p.getDinero());
//            System.out.println("id:" + p.getIdUsuario());
//        }
//
//    }
}
