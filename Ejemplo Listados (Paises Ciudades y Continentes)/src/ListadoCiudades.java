
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class ListadoCiudades {

    private List<Ciudad> listadoCiudades;

    public ListadoCiudades() {
        this.listadoCiudades = new LinkedList<>();
    }

    public String agregarCiudad(Ciudad ciudad) {
        this.listadoCiudades.add(ciudad);
        return "Ciudad Agregada.";
    }

    public Ciudad buscarCiudad(String nombre) {
        Iterator<Ciudad> iterator = this.listadoCiudades.iterator();
        while (iterator.hasNext()) {
            Ciudad ciudad = (Ciudad) iterator.next();
            if (ciudad.getNombre().equalsIgnoreCase(nombre)) {
                return ciudad;
            }
        }
        return null;
    }

    public String getListadoCiudades() {
        String s = "";
        Iterator<Ciudad> iterator = this.listadoCiudades.iterator();
        while (iterator.hasNext()) {
            Ciudad ciudad = (Ciudad) iterator.next();
            s += "\n" + ciudad.getNombre();
        }
        return s;
    }

}
