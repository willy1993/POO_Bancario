/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_bancario;

import Modelo.Cnt_Corriente;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Willy
 */
public class POO_Bancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cnt_Corriente CntC1 = new Cnt_Corriente(28);
        CntC1.setNombre("Luz Maria");
        CntC1.setApellido("Mendoza");
        CntC1.setCedula("0987654321");
        CntC1.setSaldo("200.55");
        CntC1.setFechacreacion("17/05/2017");

     
         

        List<Persona> personas = new ArrayList<>();
        personas.add(CntC1);
        personas.forEach((persona) -> {
            persona.mostrar();
        });
        
    }
    
}
