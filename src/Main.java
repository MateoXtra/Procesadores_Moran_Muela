import Procesadores.*;

public class Main {
    public static void main(String[] args) {
        //integrante David (2).
        Procesadores_moviles procesadorMoviles1 = new Procesadores_moviles();
        Procesadores_moviles procesadorMoviles2 = new Procesadores_moviles(2,23,1,"Chip",true);
        Procesadores_Escritorio procesadoresEscritorio = new Procesadores_Escritorio(8,12.34,12,"Ryzer 3 3200G","AMD4");
        procesadoresEscritorio.imprimirDatosEsctirotio();
        procesadorMoviles2.imprimirDatosMoviles();


        //integrante Mateo (1).

        Procesadores_Amd procesador_amd = new Procesadores_Amd();
        Procesadores_Intel procesador_intel = new Procesadores_Intel(8,3.24,5.65,"Intel 3-7100","Intel Socket 1151",false);
        procesador_intel.imprimirDatos();
        procesador_intel.ImprimirdatosGraficos();
        procesador_amd.imprimirDatos();
        procesador_amd.imprimirDatosAmd();

        //David crear instancia para proceador AMD con valores


        //Mateo crear instancia para proceador moviles1 con valores
        Procesadores_moviles procesadorMoviles3 = new Procesadores_moviles(1,20,2.5,"Iphone 11",true);
        procesadorMoviles3.imprimirDatosMoviles();




    }

}