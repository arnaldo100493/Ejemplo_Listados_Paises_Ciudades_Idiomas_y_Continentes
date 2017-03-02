/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Pais {

    private String nombre;
    private int cantidadHabitantes;
    private String idioma;
    private String continente;
    private ListadoCiudades listadoCiudades;

    public Pais() {
        this.nombre = "";
        this.cantidadHabitantes = 0;
        this.idioma = "";
        this.continente = "";
        this.listadoCiudades = new ListadoCiudades();
    }

    public Pais(String nombre, int cantidadHabitantes, String idioma, String continente) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.idioma = idioma;
        this.continente = continente;
        this.listadoCiudades = new ListadoCiudades();
    }

    public Pais(Pais pais) {
        this.nombre = pais.getNombre();
        this.cantidadHabitantes = pais.getCantidadHabitantes();
        this.idioma = pais.getIdioma();
        this.continente = pais.getContinente();
        this.listadoCiudades = new ListadoCiudades();
    }

    public String agregarCiudad(Ciudad ciudad) {
        return this.listadoCiudades.agregarCiudad(ciudad);
    }

    public String getListadoCiudades() {
        return this.listadoCiudades.getListadoCiudades();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

}
