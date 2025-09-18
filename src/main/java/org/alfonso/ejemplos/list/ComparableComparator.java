package org.alfonso.ejemplos.list;

import org.alfonso.ejemplos.models.Alumno;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableComparator
{
    public static void main(String[] args) {


        Alumno alfonso = new Alumno("Alfonso", 9);
        Alumno pablo = new Alumno("Pablo", 6);
        Alumno manu = new Alumno("Manuel", 5);
        Alumno ivan = new Alumno("Ivan ", 7);
        Alumno perico = new Alumno("Perico", 1);
        Alumno perico2 = new Alumno("Perico", 1);
        Alumno perico3 = new Alumno("Perico", 2);

        java.util.List<Alumno> alumnos = new ArrayList<>();

        Set<Alumno> alumnosTest = new LinkedHashSet<>();
        alumnosTest.add(alfonso);
        alumnosTest.add(pablo);
        alumnosTest.add(manu);
        alumnosTest.add(ivan);
        alumnosTest.add(perico);
        alumnosTest.add(perico2);
        alumnosTest.add(perico3);

        System.out.println("MIRA ESTO" + alumnosTest);

        java.util.List<Alumno> alumnosTestOrdenados = alumnosTest.stream()
                .sorted(Comparator.comparing(Alumno::getNombre))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("ALUMNOS ORDENADOS POR NOMBRE :" + alumnosTestOrdenados);

        alumnos.add(alfonso);
        alumnos.add(pablo);
        alumnos.add(manu);
        alumnos.add(ivan);
        alumnos.add(perico);
        alumnos.add(perico2);
        alumnos.add(perico3);

        alumnos.sort(Comparator.comparing(Alumno::getNota)
                .reversed()
                .thenComparing(Alumno::getNombre));


        for(Alumno a : alumnos)
        {
            System.out.println(a);
        }


        java.util.List<Alumno> alumnosOrdenadorPorNota = alumnos.stream()
                .sorted
                        (
                                Comparator.comparing(Alumno::getNota).reversed()
                                        .thenComparing(Alumno::getNombre)
                        )
                .collect(Collectors.toCollection(ArrayList::new));

        for(Alumno a : alumnosOrdenadorPorNota)
        {
            System.out.println(a.getNombre() + " " + a.getNota());
        }

        System.out.println();


        Set<Alumno> ordenar = alumnos.stream()
                .sorted(
                        Comparator.comparing(Alumno::getNombre)
                                .thenComparing(Alumno::getNombre))
                .collect( Collectors.toCollection( () -> new TreeSet<>(Comparator.comparing(Alumno::getNombre))));


        for(Alumno a : alumnosOrdenadorPorNota)
        {
            System.out.println(a.getNombre() + " " + a.getNota());
        }

        List<Alumno> ordenados = alumnos.stream().
                sorted(
                        Comparator.comparing(Alumno::getNombre).reversed()
                                .thenComparing(Alumno::getNota)
                ).collect(Collectors.toCollection(() -> new ArrayList<>()));

        Set<Alumno> ordenados2 = alumnos.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed())));

        System.out.println();

        for(Alumno a : ordenados2)
        {
            System.out.println(a);
        }

    }
}
