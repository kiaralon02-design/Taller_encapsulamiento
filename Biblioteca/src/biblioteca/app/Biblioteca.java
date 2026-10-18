/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.app;

import biblioteca.modelo.Libro;
import biblioteca.personas.Socio;
/**
 *
 * @author vale
 */
public class Biblioteca {

    public static void main(String[] args) {

        Libro l1 = new Libro(
                "Cien años de soledad",
                "García Márquez"
        );

        Libro l3 = new Libro(
                "Cien años de soledad",
                "García Márquez"
        );

        l1.prestar();

        Socio s1 = new Socio("Camila");

        s1.prestarLibro(l3);
        s1.prestarLibro(l1);
        s1.prestarLibro(null);

        System.out.println(s1.getLibrosPrestados());
        System.out.println(l3.estaDisponible());
    }
}
