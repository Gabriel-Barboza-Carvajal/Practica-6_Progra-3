/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



/**
 *
 * @author gabri
 */
public class CuerpoSnake{
 
    int xCoor,yCoor,tileSize,altura,ancho;
    
    
    
    public CuerpoSnake(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.tileSize = tileSize;
        altura=tileSize;//  ------>height()
        ancho=tileSize;//   ------>width()
        
    }
    
    
    
    
    
    
//-----------------------------------------------SETS Y GETS------------------------------------------------------------------
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

    public int getTileSize() {
        return tileSize;
    }

    public void setTileSize(int tileSize) {
        this.tileSize = tileSize;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

  //-----------------------------------------------SETS Y GETS------------------------------------------------------------------
    
    
    
}
