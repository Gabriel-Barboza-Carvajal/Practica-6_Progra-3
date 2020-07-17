/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladora;

import Modelo.Modelo;
import Vista.Pantalla;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Controladora implements  ActionListener,KeyListener {
    
    
    private Pantalla miPantalla;
    private Modelo snake;
    private VentanaPrincipal ventana;
    
//  Es mejor usar el contructor con la ventana que contiene a pantalla , para que se ejecuten los eventos correctamente  
//    public Controladora(Pantalla miPantalla,Modelo snake) {
//        this.miPantalla = miPantalla;//vista
//        this.snake=snake;//modelo
//        
//        //y la vista setea al controlador al modelo no por que cuando se crea la pantalla se crea la SNAKE !
//        this.miPantalla.setControladora(this);
//    }
    public Controladora(VentanaPrincipal miPantalla,Modelo snake) {
        this.ventana = miPantalla;//vista
        this.snake=snake;//modelo
        
        //y la vista setea al controlador al modelo no por que cuando se crea la pantalla se crea la SNAKE !
        this.ventana.setControladora(this);
        this.inciar();
    }
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
            System.out.print("Sucedio algo\n");
            System.out.print("codigo de tecla -> :" + ke.getKeyCode() + " \n");
            switch (ke.getKeyCode()) {
                //Abajo
                //NOTA REVISAR ESTO
                case 40:System.out.print("Abajo\n");
//                    if (this.snake.isArriba()== false) {
                        this.snake.setAbajo(true);
                        this.snake.setArriba(false);
                         this.snake.setIzquierda(false);
                        this.snake.setDerecha(false);
//                    }
                break;
                case 39://derecha
//                    if (this.snake.isIzquierda()== false) {
                    System.out.print("Derecha\n");
                    this.snake.setDerecha(true);
                    this.snake.setAbajo(false);
                    this.snake.setArriba(false);
                    this.snake.setIzquierda(false);
//                    }
                    break;
                case 38://Arriba
                    this.snake.setArriba(true);
                    
                    this.snake.setAbajo(false);
                    this.snake.setIzquierda(false);
                    this.snake.setDerecha(false);
                    break;
                case 37://izquierda
                    this.snake.setIzquierda(true);
                    this.snake.setAbajo(false);
                    this.snake.setArriba(false);
                    this.snake.setDerecha(false);
                    break;
                    
            }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
//        System.out.print("Sucedio algo\n");
//        System.out.print("codigo de tecla -> :" + ke.getKeyCode() + " \n");
//        System.out.print("Sucedio algo");
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        System.out.print("Sucedio algo");
        
    }

    private void inciar() {
       
        
        while(this.snake.isColision()==false)
          { 
              System.out.print("");
          }
        
        try {
            this.ventana.getMiPantalla().mostrarSalida();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Salio!");
       
        System.exit(0);

    }


    
}
