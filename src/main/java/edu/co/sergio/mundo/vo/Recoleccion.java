/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author Labing
 */
public class Recoleccion {
    
    private String fecha ;
    private int recolector; 
    private int idColmena ;
    private int kilosdeMiel ;
    private int idRecoleccion;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getRecolector() {
        return recolector;
    }

    public void setRecolector(int recolector) {
        this.recolector = recolector;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public int getKilosdeMiel() {
        return kilosdeMiel;
    }

    public void setKilosdeMiel(int kilosdeiel) {
        this.kilosdeMiel = kilosdeiel;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }
    
    
}
