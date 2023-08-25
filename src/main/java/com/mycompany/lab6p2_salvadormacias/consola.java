/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class consola {

    String identificación;
    String fabricante;
    int uso;
    double precio;
    juego juegos;
    String modelo;

    public consola() {
    }

    public consola(String identificación, String fabricante, int uso, double precio, juego juegos, String modelo) {
        this.identificación = identificación;
        this.fabricante = fabricante;
        this.uso = uso;
        this.precio = precio;
        this.juegos = juegos;
        this.modelo = modelo;
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
        return "consola{" + "identificaci\u00f3n=" + identificación + ", fabricante=" + fabricante + ", uso=" + uso + ", precio=" + precio + ", juegos=" + juegos + ", modelo=" + modelo + '}';
    }

}
