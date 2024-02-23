/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab6p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class equipo {

    public String pais_equipo;
    public String nombre_equipo;
    public String ciudad;
    public String estadio;

    public equipo() {
    }

    public equipo(String pais_equipo, String nombre_equipo, String ciudad, String estadio) {
        this.pais_equipo = pais_equipo;
        this.nombre_equipo = nombre_equipo;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getPais_equipo() {
        return pais_equipo;
    }

    public void setPais_equipo(String pais_equipo) {
        this.pais_equipo = pais_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "equipo{" + "pais_equipo=" + pais_equipo + ", nombre_equipo=" + nombre_equipo + ", ciudad=" + ciudad + ", estadio=" + estadio + '}';
    }

}
