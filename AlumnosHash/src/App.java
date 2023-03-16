public class App {
    public static void main(String[] args) throws Exception {
        Nacionalidades nacionalidades = new Nacionalidades();

        nacionalidades.addAlumnos("ESPAÑA");
        nacionalidades.addAlumnos("ESPAÑA");
        nacionalidades.addAlumnos("ESPAÑA");
        nacionalidades.addAlumnos("ESPAÑA");
        nacionalidades.addAlumnos("ESPAÑA");
        nacionalidades.addAlumnos("PORTUGAL");
        nacionalidades.addAlumnos("PORTUGAL");
        nacionalidades.addAlumnos("MEXICO");

        nacionalidades.showAll();
        System.out.println("---");
        nacionalidades.showNacionalidad("ESPAÑA");
        System.out.println("---");
        System.out.println(nacionalidades.cuantos());     
        nacionalidades.borra();
        System.out.println("---");
        nacionalidades.showAll();

    }
}
