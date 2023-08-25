/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6p2_salvadormacias;

/**
 *
 * @author papilon10
 */
public class estacionaria extends consola {

    int controles;
    int almacenamiento;
    String conexión;

    public estacionaria(String identificación, String fabricante, int uso, double precio, juego juegos, String modelo) {
        super(identificación, fabricante, uso, precio, juegos, modelo);
    }

    public estacionaria(int controles, int almacenamiento, String conexión, String identificación, String fabricante, int uso, double precio, juego juegos, String modelo) {
        super(identificación, fabricante, uso, precio, juegos, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexión = conexión;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getConexión() {
        return conexión;
    }

    public void setConexión(String conexión) {
        this.conexión = conexión;
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
        return super.toString() + "estacionaria{" + "controles=" + controles + ", almacenamiento=" + almacenamiento + ", conexi\u00f3n=" + conexión + '}';
    }

}
