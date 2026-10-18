/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author vale
 */
public class Vuelo {

    private String codigo;
    private String destino;
    private int sillasDisponibles;

    public Vuelo(String codigo, String destino,
            int sillasDisponibles) {

        this.codigo = codigo;
        setDestino(destino);

        if (sillasDisponibles < 0) {
            this.sillasDisponibles = 0;
        } else {
            this.sillasDisponibles = sillasDisponibles;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public int getSillasDisponibles() {
        return sillasDisponibles;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.isEmpty()) {
            System.out.println("Destino inválido");
        } else {
            this.destino = destino;
        }
    }

    public boolean reservarSilla() {
        if (sillasDisponibles > 0) {
            sillasDisponibles--;
            return true;
        } else {
            return false;
        }
    }
}
