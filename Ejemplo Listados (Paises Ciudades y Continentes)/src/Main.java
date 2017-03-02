/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("LISTADOS DE PAISES CIUDADES IDIOMAS Y CONTINENTES");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pais p1 = new Pais("Pais1", 100, "", "America");
        Pais p2 = new Pais("Pais2", 200, "", "Europa");
        Pais p3 = new Pais("Pais3", 300, "", "Europa");

        Ciudad c1 = new Ciudad("Ciudad1", 0, 0, p1);
        Ciudad c2 = new Ciudad("Ciudad2", 0, 0, p1);
        Ciudad c3 = new Ciudad("Ciudad3", 0, 0, p2);
        Ciudad c4 = new Ciudad("Ciudad4", 0, 0, p2);
        Ciudad c5 = new Ciudad("Ciudad5", 0, 0, p2);
        Ciudad c6 = new Ciudad("Ciudad6", 0, 0, p3);
        Ciudad c7 = new Ciudad("Ciudad7", 0, 0, p3);

        c.println(p1.agregarCiudad(c1));
        c.println(p1.agregarCiudad(c2));

        c.println(p2.agregarCiudad(c3));
        c.println(p2.agregarCiudad(c4));
        c.println(p2.agregarCiudad(c5));

        c.println(p3.agregarCiudad(c6));
        c.println(p3.agregarCiudad(c7));

        Mundo mundo = new Mundo();
        c.println(mundo.agregarPais(p1));
        c.println(mundo.agregarPais(p2));
        c.println(mundo.agregarPais(p3));

        mundo.agregarCiudad(c1);
        mundo.agregarCiudad(c2);
        mundo.agregarCiudad(c3);
        mundo.agregarCiudad(c4);
        mundo.agregarCiudad(c5);
        mundo.agregarCiudad(c6);
        mundo.agregarCiudad(c7);

        c.println("Paises y Ciudades Cargadas.");

        menu();
        c.println("Ingrese una opción:");
        int opcion = c.readInt();
        while (opcion != 0) {

            /*
             * Dado el nombre del país, encontrar el nombre
             * de las ciudades relacionadas.
             *
             */
            if (opcion == 1) {
                c.clear();
                c.println("Ingrese el nombre del país: ");
                String nombrePais = c.readString();
                c.println(mundo.getCiudadesPorPais(nombrePais));
            }

            /* 
             * Cantidad de paises europeos 
             *(Continente = "Europa").
             * 
             */
            if (opcion == 2) {
                c.clear();
                c.println(mundo.getPaisesEuropeos());
            }

            /* 
             * Indicar el nombre del país 
             * que tiene mayor cantidad de habitantes.
             *
             */
            if (opcion == 3) {
                c.clear();
                c.println(mundo.getPaisConMasHabitantes());
            }

            /* 
             * Dado el nombre de una ciudad encontrar
             * los datos del país relacionado.
             *
             */
            if (opcion == 4) {
                c.clear();
                c.println("Ingrese el nombre de la ciudad: ");
                String nombreCiudad = c.readString();
                c.println(mundo.getDatosCiudad(nombreCiudad));
            }

            c.println("");
            menu();
            c.println("Ingrese una opción:");
            opcion = c.readInt();
        }

        c.close();

    }

    public static void menu() {
        c.println("\n");
        c.println("[1] Buscar Ciudades de País");
        c.println("[2] Buscar Paises de Europa");
        c.println("[3] País con mas Habitantes");
        c.println("[4] Buscar País de Ciudad");
        c.println("[0] Salir");
    }
}
