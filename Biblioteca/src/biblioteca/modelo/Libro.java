/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package biblioteca.modelo;

/**
 *
 * @author vale
 */
public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        if (this.titulo == null) {
            this.titulo = "Sin titulo";
        }

        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Titulo invalido");
        } else {
            this.titulo = titulo;
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println(titulo + " de " + autor
                + " | disponible: " + disponible);
    }
    
    public boolean mismoTitulo(Libro otro) {

        if (otro == null) {
            return false;
        }

        return this.titulo.equals(otro.titulo);
    }
}
