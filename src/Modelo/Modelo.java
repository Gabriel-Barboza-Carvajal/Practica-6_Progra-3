/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;



/**
 *
 * @author gabri
 */

public class Modelo extends Observable{
    
    
    private boolean colision=false;
    
    private CuerpoSnake cuerpo;

    
    //la Modelo esta compuesta por un conjunto de partes de serpiente
    
    private ArrayList<CuerpoSnake> snake;
    
    //tiene una lista de manzanas para poder estar estableciendola cada vez que come una
    
    private ArrayList<Manzana> manzanas;
    
    
    //cordenadas de la serpiente
    private int xCoor=10,yCoor=10,size=1;
    
    
    //---------Variables para ver el cambio de direccion
    
    private boolean arriba=false,abajo=false,derecha=false,izquierda=false;
    
    
    //----------CONSTRUCTOR---------
    
    public Modelo() {
        snake=new ArrayList<>();
       this.verificarTamanioSnake();
       
    }
    
    
    
    
    
    
    //----------------METODOS DE AÑADIR _ MOVER DE LA SNAKE----------------------------------------
    
    
    
    
    public void colisionPared()
    {
        
        if(yCoor>66 || yCoor<0 || xCoor >68 || xCoor<0)
            this.setColision(true);
       
    }
    
    public void mover()
    {
        
        colisionPared();
        comer();
        if(colision)
        {
            
            this.setChanged();
            this.notifyObservers();
        }else
        {
        
        if (arriba) {
            yCoor -= 1;
        }
        if (derecha) {
            xCoor += 1;
        }
        if (abajo) {
            yCoor += 1;
        }
        if (izquierda) {
            xCoor -= 1;
            }

            cuerpo = new CuerpoSnake(xCoor, yCoor, cuerpo.getTileSize());
            cuerpo.setxCoor(xCoor);
            cuerpo.setyCoor(yCoor);
            cuerpo.setTileSize(10);
            snake.add(cuerpo);

            this.setChanged();
            this.notifyObservers();
        }
        
        if(this.snake.size()>size)//    SI EL TAMAÑO DEL VECTOR ES MAYOR AL TAMAÑO DE LA SERPIENTE
        {//                             ELIMINAMOS EL ULTIMO ELEMENTO PARA QUE PARESCA QUE SE ESTA MOVIENDO SOLO
                                   //   UNA PARTE DE LA SERPIENTE ...  
            this.snake.remove(0);
            this.setChanged();
            this.notifyObservers();
        }
        
    }

    public boolean isColision() {
        return colision;
    }

    public void comer()
    {
        boolean a=false;
        for (int i = 0; i < manzanas.size(); i++) {
            if(xCoor==manzanas.get(i).getxCoor() && yCoor==manzanas.get(i).getyCoor())
            {   size+=10;
                manzanas.remove(i);
                i--;
                this.setChanged();
                this.notifyObservers();
            }
        }
         Random r = new Random();
//                 yCoor>26 || yCoor<0 || xCoor >38 || xCoor<0);
         if(manzanas.size()==0)
         {
             int xCoor=r.nextInt(68);
             int yCoor=r.nextInt(66);
             manzanas.add(new Manzana(xCoor,yCoor,10));
             
        this.setChanged();
        this.notifyObservers();
         }
    }
    
    
    //---------------- FIN --->  METODOS DE AÑADIR _ MOVER DE LA SNAKE----------------------------------------

    //_---------------------------------------------SETS Y GETS--------------------------------------------------------

    
    
    public void setColision(boolean colision) {
        this.colision = colision;
    }
    
    
    public ArrayList<Manzana> getManzanas() {
        return manzanas;
    }

    public void setManzanas(ArrayList<Manzana> manzanas) {
        this.manzanas = manzanas;
    }
    
    
    public boolean isArriba() {
        return arriba;
    }

    public void setArriba(boolean arriba) {
        this.arriba = arriba;
    }

    public boolean isAbajo() {
        return abajo;
    }

    public void setAbajo(boolean abajo) {
        this.abajo = abajo;
    }

    public boolean isDerecha() {
        return derecha;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public boolean isIzquierda() {
        return izquierda;
    }

    public void setIzquierda(boolean izquierda) {
        this.izquierda = izquierda;
    }
    
    
    public void verificarTamanioSnake()
    {
         manzanas=new ArrayList<>();
         if(snake.isEmpty())
        {
            cuerpo=new CuerpoSnake(xCoor,yCoor,10);
            snake.add(cuerpo);
        this.setChanged();
        this.notifyObservers();
        }
        
         
    }
    
    public CuerpoSnake getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(CuerpoSnake cuerpo) {
        this.cuerpo = cuerpo;
    }

    public ArrayList<CuerpoSnake> getSnake() {
        return snake;
    }

    public void setSnake(ArrayList<CuerpoSnake> snake) {
        this.snake = snake;
    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    public int getSize() {
        return snake.size();
    }

    
   
     
}
