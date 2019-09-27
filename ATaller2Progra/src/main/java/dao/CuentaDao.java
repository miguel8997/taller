
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CuentaDao {
    
    private Conexion con;

    public CuentaDao() {
        this.con = new Conexion();
    }
    
//    public ArrayList<Cuenta> getCuentas() {  //busca todas
//
//        ArrayList<Cuenta> cuentasBd = new ArrayList<>();
//        Connection accesoBD = con.getConexion();
//
//        try {
//            String sql = "SELECT * FROM cuenta";
//
//            //System.out.println(sql);
//            Statement st = accesoBD.createStatement();
//            ResultSet resultados = st.executeQuery(sql);
//
//            while (resultados.next()) {
//                
//                String tipo = resultados.getString("tipo");
//                int dinero = Integer.parseInt(resultados.getString("dinero"));
//                int id_Usuario=Integer.parseInt(resultados.getString("id_Usuario"));
//                cuentasBd.add(new Cuenta(tipo,dinero,id_Usuario));
//            }
//            
//            return cuentasBd;
//        } catch (Exception e) {
//            System.out.println();
//            System.out.println("Error al obtener");
//            e.printStackTrace();
//            return null;
//        }
//
//    }
    
//    public void insertPersona(Cuenta c){  //agrega
//        
//        Connection accesoBD=con.getConexion();
//        
//        try{
//            String sql="INSERT INTO cuenta (tipo,dinero,id_Usuario)" 
//                        + "VALUES ('"+c.getTipo()+"',"+c.getDinero()
//                        +","+c.getIdUsuario()+")";
//            
//            Statement st=accesoBD.createStatement();
//            st.executeUpdate(sql);
//            
//        }catch(Exception e){
//            System.out.println("Error al insertar la cuenta");
//            e.printStackTrace();
//        }
//        
//    }
    
//    public void eliminar(int idCuenta,String propietario){  //eliminar
//        
//        Connection accesoBD = con.getConexion();
//
//        try {
//            String sql = "DELETE FROM cuenta WHERE idCuenta="+idCuenta+" and propietario='"+propietario+"'";
//            
//            Statement st = accesoBD.createStatement();
//            
//            st.executeUpdate(sql);
//
//        } catch (Exception e) {
//            System.out.println();
//            System.out.println("Error al eliminar");
//            e.printStackTrace();
//            
//        }
//    }
    
//    public void MostrarInfo(){
//        
//        for (Cuenta p:getCuentas()) {
//            System.out.println("tipo: "+p.getTipo());
//            System.out.println("dinero : "+p.getDinero());
//            System.out.println("id:"+p.getIdUsuario());
//        }
//        
//    }
}
