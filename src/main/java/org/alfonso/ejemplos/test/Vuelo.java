package org.alfonso.ejemplos.test;

import java.util.Date;
import java.util.Objects;

public class Vuelo
{
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaYHoraDeLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaYHoraDeLlegada, int cantidadPasajeros)
    {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaYHoraDeLlegada = fechaYHoraDeLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {return nombre;}

    public String getOrigen() {return origen;}

    public String getDestino() {return destino;}

    public Date getFechaLlegada() {return fechaYHoraDeLlegada;}


    public int getCantidadPasajeros() {return cantidadPasajeros;}


    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setOrigen(String origen) {this.origen = origen;}

    public void setDestino(String destino) {this.destino = destino;}

    public void setFechaLlegada(Date fechaLlegada) {this.fechaYHoraDeLlegada = fechaLlegada;}


    public void setCantidadPasajeros(int cantidadPasajeros) {this.cantidadPasajeros = cantidadPasajeros;}


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return cantidadPasajeros == vuelo.cantidadPasajeros && Objects.equals(nombre, vuelo.nombre) && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fechaYHoraDeLlegada, vuelo.fechaYHoraDeLlegada);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nombre, origen, destino, fechaYHoraDeLlegada, cantidadPasajeros);
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre  + " ///" +
                " Origen= " + origen  + " ///" +
                " Destino= " + destino  + " ///" +
                " FechaLlegada= " + fechaYHoraDeLlegada + " ///" +
                " CantidadPasajeros= " + cantidadPasajeros;
    }
}
