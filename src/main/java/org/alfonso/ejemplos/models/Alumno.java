package org.alfonso.ejemplos.models;

import java.util.Objects;

public class Alumno
{
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota)
    {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre +
                " nota=" + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return nota == alumno.nota && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nombre, nota);
    }
}
