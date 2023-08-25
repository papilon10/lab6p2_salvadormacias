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

    int tamano;
    int batería;
    boolean estuche;

    public consola() {
    }

    public consola(int tamano, int batería, boolean estuche) {
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

    @Override
    public String toString() {
        return "consola{" + "tamano=" + tamano + ", bater\u00eda=" + batería + ", estuche=" + estuche + '}';
    }
    
    
}
