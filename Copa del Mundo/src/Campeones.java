import java.util.*;

public class Campeones {
    HashMap<Integer, String> campeones = new HashMap<Integer, String>();

    public Campeones() {
        campeones.put(1930, "Uruguay");
        campeones.put(1934, "Italia");
        campeones.put(1938, "Italia");
        campeones.put(1950, "Uruguay");
        campeones.put(1954, "Alemania");
        campeones.put(1958, "Brasil");
        campeones.put(1962, "Brasil");
        campeones.put(1966, "Inglaterra");
        campeones.put(1970, "Brasil");
        campeones.put(1974, "Alemania");
        campeones.put(1978, "Argentina");
        campeones.put(1982, "Italia");
        campeones.put(1986, "Argentina");
        campeones.put(1990, "Alemania");
        campeones.put(1994, "Brasil");
        campeones.put(1998, "Francia");
        campeones.put(2002, "Brasil");
        campeones.put(2006, "Italia");
        campeones.put(2010, "España");
        campeones.put(2014, "Alemania");
    }

    public String ganoEnAño(int año){
        String strRet = "";
        if(campeones.containsKey(año)){
            strRet = campeones.get(año);
        }else{
            strRet = "No hay campeon del Mundo ese año";
        }        
        return strRet;
    }

    public String ganoPais(String pais){
        String strRet = "";
        boolean encontrado = false;
        Iterator it =campeones.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            if(campeones.get(key) == pais){
                strRet += key;
                encontrado = true;
            }
        }
        if(!encontrado){
            strRet = pais+" no ha ganado ninguna copa del mundo";
        }
        return strRet;
    }

}
