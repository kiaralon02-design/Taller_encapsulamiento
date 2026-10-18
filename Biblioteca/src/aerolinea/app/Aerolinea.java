/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.app;

/**
 *
 * @author vale
 */
import aerolinea.modelo.Vuelo;
import aerolinea.modelo.Pasajero;

public class Aerolinea {

    public static void main(String[] args) {

        Vuelo v1 = new Vuelo("AV-204", "Cartagena", 2);

        Pasajero p1 = new Pasajero("Sara");
        Pasajero p2 = new Pasajero("Tomás");
        Pasajero p3 = new Pasajero("Lina");

        p3.mostrarReserva();

        p1.reservar(v1);
        p2.reservar(v1);
        p3.reservar(v1);

        System.out.println(v1.getSillasDisponibles());

        v1.setDestino("Santa Marta");

        p1.mostrarReserva();
        p2.mostrarReserva();
        p3.mostrarReserva();

        System.out.println(p1.getVuelo() == p2.getVuelo());
    }
}
