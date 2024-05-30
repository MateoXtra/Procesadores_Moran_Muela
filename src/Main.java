import Procesadores.Procesador;
import Procesadores.Procesadores_Amd;
import Procesadores.Procesadores_Intel;
import Procesadores.Procesadores_moviles;

public class Main {
    public static void main(String[] args) {
        //integrante David (2).
        Procesadores_moviles procesadorMoviles1 = new Procesadores_moviles();
        Procesadores_moviles procesadorMoviles2 = new Procesadores_moviles(2,23,1,"Chip",true);


        //integrante Mateo (1).

        Procesadores_Amd procesador_amd = new Procesadores_Amd();
        Procesadores_Intel procesador_intel = new Procesadores_Intel(8,3.24,5.65,"Intel 3-7100","Intel Socket 1151",false);
    }

}