/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Ciudad {

    private String nombre;
    private int cantidadUniversidades;
    private int cantidadMuseos;
    private Pais pais;

    public Ciudad() {
        this.nombre = "";
        this.cantidadUniversidades = 0;
        this.cantidadMuseos = 0;
    }

    public Ciudad(String nombre, int cantidadUniversidades, int cantidadMuseos) {
        this.nombre = nombre;
        this.cantidadUniversidades = cantidadUniversidades;
        this.cantidadMuseos = cantidadMuseos;
    }

    public Ciudad(String nombre, int cantidadUniversidades, int cantidadMuseos, Pais pais) {
        this.nombre = nombre;
        this.cantidadUniversidades = cantidadUniversidades;
        this.cantidadMuseos = cantidadMuseos;
        this.pais = pais;
    }

    public Ciudad(Ciudad ciudad) {
        this.nombre = ciudad.getNombre();
        this.cantidadUniversidades = ciudad.getCantidadUniversidades();
        this.cantidadMuseos = ciudad.getCantidadMuseos();
        this.pais = ciudad.getPais();
    }

    public String getNombrePais() {
        if (this.pais != null) {
            return this.pais.getNombre();
        }
        return "Ciudad Sin País Asociado.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadUniversidades() {
        return cantidadUniversidades;
    }

    public void setCantidadUniversidades(int cantidadUniversidades) {
        this.cantidadUniversidades = cantidadUniversidades;
    }

    public int getCantidadMuseos() {
        return cantidadMuseos;
    }

    public void setCantidadMuseos(int cantidadMuseos) {
        this.cantidadMuseos = cantidadMuseos;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
