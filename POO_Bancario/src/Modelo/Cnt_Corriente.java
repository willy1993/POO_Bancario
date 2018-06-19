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
public class Cnt_Corriente extends Persona {
    private String fechacreacion;
    private String Saldo;
    private String EstadodeApertura;
    private String NumerodeCuenta;
    
    public Cnt_Corriente() {
    }

    public Cnt_Corriente(int id) {
        super(id);
    }

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

    public String getEstadodeApertura() {
        return EstadodeApertura;
    }

    public void setEstadodeApertura(String EstadodeApertura) {
        this.EstadodeApertura = EstadodeApertura;
    }

    public String getNumerodeCuenta() {
        return NumerodeCuenta;
    }

    public void setNumerodeCuenta(String NumerodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
    }

    
    
    
    

    
    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("---> Ctn Corrientes");
        System.out.println(String.format("#Cuenta.- %s   Esatado Actual.-, %s", fechacreacion,Saldo));
        System.out.println(String.format("Fecha De Creacion.- %s   Saldo Actual.-, %s", fechacreacion,Saldo,Saldo));
    }


    
    
    
}
