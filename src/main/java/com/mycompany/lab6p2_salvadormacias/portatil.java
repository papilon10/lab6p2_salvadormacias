/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class portatil extends consola {

    int tamano;
    int batería;
    boolean estuche;

    public portatil(String identificación, String fabricante, int uso, double precio, juego juegos, String modelo) {
        super(identificación, fabricante, uso, precio, juegos, modelo);
    }

    public portatil(int tamano, int batería, boolean estuche, String identificación, String fabricante, int uso, double precio, juego juegos, String modelo) {
        super(identificación, fabricante, uso, precio, juegos, modelo);
        this.tamano = tamano;
        this.batería = batería;
        this.estuche = estuche;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getBatería() {
        return batería;
    }

    public void setBatería(int batería) {
        this.batería = batería;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public juego getJuegos() {
        return juegos;
    }

    public void setJuegos(juego juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "portatil{" + "tamano=" + tamano + ", bater\u00eda=" + batería + ", estuche=" + estuche + '}';
    }

}
