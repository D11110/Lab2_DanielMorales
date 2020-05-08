/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danielmorales;

/**
 *
 * @author danie
 */
public class CasasNuevas {
    private int num_casa;
    private int num_bloque;
    private String color;
    private int ancho;
    private int largo;
    private boolean comprada;
    private int num_pisos;
    private int num_bath;
    private int num_cuartos;
    private String estado;
    private String nombre_ing;
    
    
    public CasasNuevas(int num_casa, int num_bloque, String color, int ancho, int largo, boolean comprada, int num_pisos, int num_bath,int num_cuartos,  String estado, String nombre_ing){
        this.num_casa = num_casa;
        this.num_bloque = num_bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.num_pisos = num_pisos;
        this.num_bath = num_bath;
        this.num_cuartos = num_cuartos;
        this.estado = estado;
        this.nombre_ing = nombre_ing;
    }

    @Override
    public String toString() {
        return "\nNumero de casa=" + num_casa + ", Numero de bloque=" + num_bloque + ", Color=" + color + "\nAncho"+ancho + ", Largo=" + largo + ", Comprada=" + comprada + "\n1Numero de pisos=" + num_pisos + ", Numero de banos=" + num_bath + ", Numero de cuartos=" + num_cuartos + ", Estado=" + estado + "\nNombre Ing a cargo=" + nombre_ing + "\n";
    }

    public int getNum_casa() {
        return num_casa;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    public int getNum_bloque() {
        return num_bloque;
    }

    public void setNum_bloque(int num_bloque) {
        this.num_bloque = num_bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public boolean isComprada() {
        return comprada;
    }

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }

    public int getNum_pisos() {
        return num_pisos;
    }

    public void setNum_pisos(int num_pisos) {
        this.num_pisos = num_pisos;
    }

    public int getNum_bath() {
        return num_bath;
    }

    public void setNum_bath(int num_bath) {
        this.num_bath = num_bath;
    }

    public int getNum_cuartos() {
        return num_cuartos;
    }

    public void setNum_cuartos(int num_cuartos) {
        this.num_cuartos = num_cuartos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre_ing() {
        return nombre_ing;
    }

    public void setNombre_ing(String nombre_ing) {
        this.nombre_ing = nombre_ing;
    }
    
    
}
