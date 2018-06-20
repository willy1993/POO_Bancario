/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Willy
 */
public class Cnt_Ahorro extends Persona {
    private String fechacreacion;
    private String Saldo;
    private String Estado;
    private String NumerodeCuenta;

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNumerodeCuenta() {
        return NumerodeCuenta;
    }

    public void setNumerodeCuenta(String NumerodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
    }

    public Cnt_Ahorro(String fechacreacion, String Saldo, String Estado, String NumerodeCuenta, int id, String cedula, String nombre, String apellido) {
        super(id, cedula, nombre, apellido);
        this.fechacreacion = fechacreacion;
        this.Saldo = Saldo;
        this.Estado = Estado;
        this.NumerodeCuenta = NumerodeCuenta;
    }
    
    
    
        @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("---> Ctn Ahorro");
        System.out.println(String.format("#Cuenta.- %s   Esatado Actual.-, %s", NumerodeCuenta,Estado));
        System.out.println(String.format("Fecha De Creacion.- %s   Saldo Actual.-, %s", fechacreacion,Saldo,Saldo));
        System.out.println("<------------------------------------------------------------->");
    }

    
    
    
    
    
    
    
    
    
    
    
}
