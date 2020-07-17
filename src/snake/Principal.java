/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import Controladora.Controladora;
import Vista.Pantalla;
import Vista.VentanaPrincipal;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaPrincipal v=new VentanaPrincipal();
        
        Modelo.Modelo snake=new Modelo.Modelo();
        
        Pantalla miPantalla=new Pantalla(snake);
//        miPantalla.setBackground(Color.yellow);
        v.setMiPantalla(miPantalla);
        
//        Controladora controladora=new Controladora(miPantalla,snake);
        
        Controladora controladora=new Controladora(v,snake);        
        
//        while(true)
//        {
//            snake.mover();
//            try {
//                sleep(20);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
      
        
    }
    
}
