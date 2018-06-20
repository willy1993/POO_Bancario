/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_bancario;

import Modelo.Cnt_Ahorro;
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
        Cnt_Corriente CntC1 = new Cnt_Corriente("19/05/2017","258.45","Activo","4654871132",200,"0987654321","Luz Maria","Mendoza");
        Cnt_Corriente CntC2 = new Cnt_Corriente("10/01/2015","080.55","Activo","9797334885",54,"0913454787","Carlos Eduardo","Andrade Mendoza");
        Cnt_Corriente CntC3 = new Cnt_Corriente("08/12/2016","157.01","Activo","1324556588",112,"1647991668","Sebastian Jeremias","Andrade Moran");
     
        Cnt_Ahorro CntA1 = new Cnt_Ahorro("19/01/2018","080.55","Activo","1221111347",102,"0123747975","Carlos Alberto","Pinela Mendoza");
        Cnt_Ahorro CntA2 = new Cnt_Ahorro("01/02/2018","080.55","Activo","2245798321",158,"0874661348","Jose Antonio","Mendoza Chicaiza");
        Cnt_Ahorro CntA3 = new Cnt_Ahorro("10/11/2000","080.55","Pasivo","4848468795",88,"0974313166","Bryan Alexander","Quimi Salto");
       
        

     
         

        List<Persona> personas = new ArrayList<>();
        personas.add(CntC1);
        personas.add(CntA1);
        personas.add(CntC2);
        personas.add(CntC3);
        personas.add(CntA2);
        personas.add(CntA3);
        
        personas.forEach((persona) -> {
            persona.mostrar();
        });
        
    }
    
}
