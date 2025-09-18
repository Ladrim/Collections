package org.alfonso.ejemplos;

import org.alfonso.ejemplos.models.Alumno;

import java.util.ArrayList;

public class List
{
    public static void main(String[] args)
    {
        Alumno alfonso = new Alumno("Alfonso", 9);
        Alumno pablo = new Alumno("Pablo", 6);
        Alumno manu = new Alumno("Manuel", 5);
        Alumno ivan = new Alumno("Ivan ", 7);
        Alumno perico = new Alumno("Perico", 1);
        Alumno perico2 = new Alumno("Perico2", 1);
        Alumno perico3 = new Alumno("Perico3", 1);

        java.util.List<Alumno> al = new ArrayList<>();

        System.out.println(al + " size= " + al.size());
        System.out.println("está vacia " + al.isEmpty());

        al.add(alfonso);
        al.add(pablo);
        al.add(manu);
        al.add(ivan);
        al.add(perico);
        al.add(perico2);
        al.add(perico3);
        al.remove(perico);

        boolean b = al.contains(new Alumno("Alfonso",9));
        System.out.println("Contains " + b);

        System.out.println("Indice de Alfonso :" + al.indexOf(alfonso));

        System.out.println(al + " size= " + al.size());
        System.out.println("está vacia " + al.isEmpty());
    }
}
