
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
public class ListadoPaises {

    private List<Pais> listadoPaises;

    public ListadoPaises() {
        this.listadoPaises = new LinkedList<>();
    }

    public String agregarPais(Pais pais) {
        this.listadoPaises.add(pais);
        return "País Agregado.";
    }

    public Pais buscarPais(String nombre) {
        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombre)) {
                return pais;
            }
        }
        return null;
    }

    public String getListadoPaises() {
        String s = "";
        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            s += "\n" + pais.getNombre();
        }
        return s;
    }

    public String getPaisesEuropeos() {
        String s = "";
        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getContinente().equalsIgnoreCase("Europa")) {
                s += "\n" + pais.getNombre();
            }
        }
        return s;
    }

    public String getPaisConMasHabitantes() {
        String nombreMayor = "";
        int cantidadMayor = 0;

        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getCantidadHabitantes() > cantidadMayor) {
                cantidadMayor = pais.getCantidadHabitantes();
                nombreMayor = pais.getNombre();
            }
        }
        return nombreMayor + "(" + cantidadMayor + ")";
    }

}
