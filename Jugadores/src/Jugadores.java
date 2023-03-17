import java.util.ArrayList;
import java.util.HashMap;

public class Jugadores {
    HashMap<String, ArrayList<String>> jugadores = new HashMap<String,ArrayList<String>>();

    public Jugadores(){

    }

    public void añadirJugadoresBarcelona(){
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Messi");
        nombre.add("Suarez");
        nombre.add("Neymar");
        nombre.add("Iniesta");
        jugadores.put("Barcelona", nombre);
        nombre.add("Rakitic");
        nombre.add("Busquets");


    }

    public void añadirJugadoresMadrid(){
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Cristiano");
        nombre.add("Benzema");
        nombre.add("Bale");
        nombre.add("Modric");
        jugadores.put("Madrid", nombre);
        nombre.add("Kross");
        nombre.add("Casemiro");
    }

    public void mostrarJugadores(){
        for (String equipo : jugadores.keySet()) {
            System.out.println(equipo+" - "+jugadores.values());
        }
    }

    public boolean existe(String equipo, String nombre){
        boolean bRet = false;
        if(jugadores.containsKey(equipo)){
            ArrayList<String> nombres = jugadores.get(equipo);
            if(nombres.contains(nombre)){
                bRet = true;
            }

        }
        return bRet;
    }
}
