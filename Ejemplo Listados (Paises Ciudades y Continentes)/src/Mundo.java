/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Mundo {

    private ListadoPaises listadoPaises;
    private ListadoCiudades listadoCiudades;

    public Mundo() {
        this.listadoPaises = new ListadoPaises();
        this.listadoCiudades = new ListadoCiudades();
    }

    public String agregarPais(Pais pais) {
        return this.listadoPaises.agregarPais(pais);
    }

    public String agregarCiudad(Ciudad ciudad) {
        return this.listadoCiudades.agregarCiudad(ciudad);
    }

    public String getCiudadesPorPais(String nombrePais) {
        Pais pais = this.listadoPaises.buscarPais(nombrePais);
        if (pais != null) {
            return pais.getListadoCiudades();
        }
        return "País no encontrado.";
    }

    public String getPaisesEuropeos() {
        return this.listadoPaises.getPaisesEuropeos();
    }

    public String getPaisConMasHabitantes() {
        return this.listadoPaises.getPaisConMasHabitantes();
    }

    public String getDatosCiudad(String nombreCiudad) {
        Ciudad ciudad = this.listadoCiudades.buscarCiudad(nombreCiudad);
        if (ciudad != null) {
            return ciudad.getNombrePais();
        }
        return "Ciudad no encontrada.";
    }

}
