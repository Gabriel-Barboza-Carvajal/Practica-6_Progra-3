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
public class Manzana {
    
    private int xCoor,yCoor,ancho,altura;

    public Manzana(int xCoor, int yCoor, int tamanioCola) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.ancho = tamanioCola;
        this.altura = tamanioCola;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
    
    
}
