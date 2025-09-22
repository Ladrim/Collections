package org.alfonso.ejemplos.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        List<Vuelo> lista = new ArrayList<>();

        lista.add(new Vuelo("AAl933","New York","Santiago", toDate("2021-08-29 05:39"),62));
        lista.add(new Vuelo("LAT755","Sao Paulo","Santiago",toDate("2021-08-31 04:45"),47));
        lista.add(new Vuelo("SKU621","Rio de Janeiro","Santiago",toDate("2021-08-30 04:45"),52));
        lista.add(new Vuelo("DAL147","Atlanta","Santiago",toDate("2021-08-29 13:22"),59));
        lista.add(new Vuelo("AVA241","Bogota","Santiago",toDate("2021-08-31 14:05"),25));
        lista.add(new Vuelo("AMX10","Mexico City","Santiago",toDate("2021-08-31 05:20"),29));
        lista.add(new Vuelo("IBE6833","Londres","Santiago",toDate("2021-08-30 08:45"),55));
        lista.add(new Vuelo("LAT2479","Frankfurt","Santiago",toDate("2021-08-29 07:41"),51));
        lista.add(new Vuelo("SKU803","Lima","Santiago",toDate("2021-08-30 10:35"),48));
        lista.add(new Vuelo("LAT533","Los Angeles","Santiago",toDate("2021-08-29 09:14"),59));
        lista.add(new Vuelo("LAT1447","Guayaquil","Santiago",toDate("2021-08-31 08:33"),29));
        lista.add(new Vuelo("CMP111","Panama City","Santiago",toDate("2021-08-31 15:15"),29));
        lista.add(new Vuelo("LAT705","Madrid","Santiago",toDate("2021-08-30 08:14"),47));
        lista.add(new Vuelo("AAL957","Miami","Santiago",toDate("2021-08-29 22:53"),60));
        lista.add(new Vuelo("ARG5091","Buenos Aires","Santiago",toDate("2021-08-31 09:57"),32));
        lista.add(new Vuelo("LAT1283","Cancún","Santiago",toDate("2021-08-31 04:00"),35));
        lista.add(new Vuelo("LAT579","Barcelona","Santiago",toDate("2021-08-29 07:45"),61));
        lista.add(new Vuelo("AAL945","Dallas-Fort Worth","Santiago",toDate("2021-08-30 07:12"),58));
        lista.add(new Vuelo("LAT501","París","Santiago",toDate("2021-08-29 18:29"),49));

        lista.sort(Comparator.comparing(Vuelo::getFechaLlegada));
        for(Vuelo a : lista)
        {
            System.out.println(a);
        }

        System.out.println();
        System.out.println(lista.get(lista.size()-1).getNombre());

        lista.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));

        System.out.println(lista.get(0).getNombre());

    }

    private static Date toDate(String dateAsString) throws ParseException
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        return df.parse(dateAsString);
    }
}
