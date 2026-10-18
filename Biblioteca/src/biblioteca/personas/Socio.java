/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.personas;

import biblioteca.modelo.Libro;

/**
 *
 * @author vale
 */
public class Socio {

    private String nombre;
    private int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {

        if (libro == null) {
            System.out.println("No hay libro para prestar");

        } else if (!libro.estaDisponible()) {
            System.out.println(
                    libro.getTitulo() + " no esta disponible"
            );

        } else {
            libro.prestar();
            librosPrestados++;

            System.out.println(
                    nombre + " recibio " + libro.getTitulo()
            );
        }
    }
    
    public void devolverLibro(Libro libro) {

        if (libro == null) {
            System.out.println("No hay libro para devolver");
        } else {
            libro.devolver();

            if (librosPrestados > 0) {
                librosPrestados--;
            }
        }
    }

}


