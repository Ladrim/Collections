package org.alfonso.ejemplos.map;

import java.util.Map;

public class TreeMap
{
    public static void main(String[] args)
    {
        Map<String, Object> persona = new java.util.TreeMap<>();

        persona.put("nombre", "Eustabio");
        persona.put("nombre" , "Pepito");
        persona.put("apellido", "Mongoles");
        persona.put("email","Perico.Palotes@email.com");
        persona.put("edad",30);


        Map<String,String> direccion = new java.util.TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion",direccion);

        System.out.println("persona" + persona);
    }
}
