import java.util.HashMap;
import java.util.Iterator;

public class Nacionalidades {
    HashMap<String, Integer> nacionalidades = new HashMap<String, Integer>();

    public Nacionalidades(){
        
    }

    public void addAlumnos(String nacionalidad){
        if (nacionalidades.containsKey(nacionalidad)){
            Integer i = nacionalidades.get(nacionalidad);
            nacionalidades.remove(nacionalidad);
            nacionalidades.put(nacionalidad, ++i);
          }else{
            nacionalidades.put(nacionalidad,1);
          }
    }

    public void showAll(){
        for(String key: nacionalidades.keySet()){
            System.out.println(key+" - "+ nacionalidades.get(key));
        }
    }

    public void showNacionalidad(String nacionalidad){
        Iterator it = nacionalidades.keySet().iterator();
        boolean encontrado = false;
        while(it.hasNext() && !encontrado){
            String key = (String)it.next();
            if(key.equals(nacionalidad)){
                System.out.println(key+" - "+ nacionalidades.get(key));
                encontrado = true;
            }
        }
    }

    public int cuantos(){
        return nacionalidades.size();
    }

    public void borra(){
        nacionalidades.clear();
    }
}
