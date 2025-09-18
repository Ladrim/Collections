package org.alfonso.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2
{
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("nombre", "John");
        persona.put("nombre", "Pepito"); //Añadira este y no el anterior, porque tienen la misma llave
        persona.put("apellido", "Doe");
        persona.put("email", "Josh.doe@email.com");
        persona.put("edad", "30");


        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        String apellido = persona.get("apellido");
        String email = persona.get("email");
        String edad = persona.get("edad");

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("email = " + email);
        System.out.println("edad = " + edad);

        Boolean b1 = persona.remove("nombre", "Pepito"); //Retorna True or False
        System.out.println(b1);

        Boolean b2 = persona.containsKey("edad");
        System.out.println("containsKey " + b2);

        Boolean b3 = persona.containsValue("30");
        System.out.println("constainsValue " + b3);

        Collection<String> valores = persona.values();
        for (String v : valores) {
            System.out.println(v);
        }

        Set<String> keys = persona.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        for (Map.Entry<String, String> entry: persona.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("total " + persona.size());
        System.out.println("contiene elementos " + !persona.isEmpty());

        persona.replace("edad", "45"); //Para reemplazar un value mediante la key introducida



    }
}
