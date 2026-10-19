//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package videojuego;

public class Main {
    public static void main(String[] args){

        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Supervivencia";
        juego1.version = "1.21";
        juego1.activo = false;

        juego2.nombre = "Fortnite";
        juego2.genero = "Battle Royale";
        juego2.version = "1.0";
        juego2.activo = false;

        juego3.nombre = "Call of Duty";
        juego3.genero = "Shooter";
        juego3.version = "1.0";
        juego3.activo = false;

        juego1.iniciar();
        juego2.iniciar();
        juego3.iniciar();

        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

    }
}