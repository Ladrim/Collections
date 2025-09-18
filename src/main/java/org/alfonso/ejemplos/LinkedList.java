package org.alfonso.ejemplos;

import org.alfonso.ejemplos.models.Alumno;

import java.util.ListIterator;

public class LinkedList
{
    public static void main(String[] args) {


        Alumno alfonso = new Alumno("Alfonso", 9);
        Alumno pablo = new Alumno("Pablo", 6);
        Alumno manu = new Alumno("Manuel", 5);
        Alumno ivan = new Alumno("Ivan ", 7);
        Alumno perico = new Alumno("Perico", 1);
        Alumno perico2 = new Alumno("Perico2", 1);
        Alumno perico3 = new Alumno("Perico3", 1);

        java.util.LinkedList<Alumno> linked = new java.util.LinkedList<>();

        linked.add(alfonso);
        linked.add(pablo);
        linked.add(manu);
        linked.add(ivan);
        linked.add(perico);
        linked.add(perico2);
        linked.add(perico3);

        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        System.out.println();

        linked.removeFirst();
        linked.removeLast();

        System.out.println("Indice de Alfonso :" + linked.indexOf(ivan));

        System.out.println(linked + " size= " + linked.size());
        for(Alumno a : linked)
        {
            System.out.println(a.getNombre());
        }

        ListIterator<Alumno> li = linked.listIterator();
        while(li.hasNext())
        {
            Alumno a = li.next();
            System.out.println(a);
        }

        System.out.println();

        while(li.hasPrevious())
        {
            Alumno a = li.previous();
            System.out.println(a);
        }



    }
}
