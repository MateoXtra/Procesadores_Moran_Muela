import Procesadores.Procesador;
import Procesadores.Procesadores_moviles;

public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador(4,12.232,12.343,"Intel Ik98455");

        procesador.imprimirDatos();
        Procesadores_moviles procesadorMoviles = new Procesadores_moviles(2,23,1,"Chip",true);




    }

}