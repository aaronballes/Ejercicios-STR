public class App {
    public static void main(String[] args) throws Exception {
        Jugadores barcelona = new Jugadores();
        barcelona.añadirJugadoresBarcelona();
        barcelona.mostrarJugadores();
        System.out.println(barcelona.existe("Barcelona","Neymar"));
        Jugadores madrid = new Jugadores();
        madrid.añadirJugadoresMadrid();
        madrid.mostrarJugadores();
    }
}
