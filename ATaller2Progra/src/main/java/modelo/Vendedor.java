
package modelo;

import java.util.ArrayList;


public class Vendedor {
    
    private int idVendedor;
    private String nombre;
    private String apellido;
    private String rut;
    private ArrayList<Venta> ventas;

    public Vendedor(int idVendedor, String nombre, String apellido, String rut, ArrayList<Venta> ventas) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.ventas = ventas;
    }

    public Vendedor() {
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
    

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.apellido;
    }

    
    
    
    
    
}
