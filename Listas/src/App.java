import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    static ArrayList<String> listDias = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        

            listDias.add("Lunes");
            listDias.add("Martes");
            listDias.add("Miercoles");
            listDias.add("Jueves");
            listDias.add("Viernes");
            listDias.add("Sabado");
            listDias.add("Domingo");
            devolverLista();
            listDias.add(4,"Juernes");
            System.out.println("-----");
            devolverLista();
            System.out.println("------");
            System.out.println("Muestra el contenido de las posiciones 3 y 4");
            System.out.println(listDias.get(3));
            System.out.println(listDias.get(4));
            System.out.println("------");
            System.out.println("Muestra el primer elemento y el ultimo de la lista original");
            System.out.println(listDias.get(0));
            System.out.println(listDias.get(listDias.size() - 1 ));
            System.out.println("-------");
            System.out.println("Busca si existe en la lista un elemento que se denomine Lunes");
            System.out.println(listDias.contains("Lunes"));
            System.out.println("------");
            System.out.println("Ordena la lista y muestra su contenido");
            ArrayList<String> listDos =new ArrayList<String>(listDias);

    }

    public static void devolverLista() {
        Iterator it = listDias.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
