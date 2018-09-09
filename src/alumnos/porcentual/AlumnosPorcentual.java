/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos.porcentual;

/**
 *
 * @author yrodr
 */
public class AlumnosPorcentual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Ing = 1800;
        double Med = 2100;
        double Mark = 750;
        double total = (Ing+Med+Mark);
        
        System.out.println("Porcentaje de alumnos de Ingenieria:");
        System.out.println(Ing*100/total);
        System.out.println("Porcentaje de alumnos de Medicina");
        System.out.println(Med*100/total);
        System.out.println("Porcentaje de alumnos de Marketing");
        System.out.println(Mark*100/total);
        
                
        
        
               
        
             
        
    }
    
}
