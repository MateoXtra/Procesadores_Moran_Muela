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
        Procesadores_Amd procesador_amd1 = new Procesadores_Amd(5,1,34,"Ryzer 7 5700G","AM4",true);



        //Mateo crear instancia para proceador moviles1 con valores
        Procesadores_moviles procesadorMoviles3 = new Procesadores_moviles(1,20,2.5,"Iphone 11",true);
        procesadorMoviles3.imprimirDatosMoviles();


        //David Muela
        Procesadores_AMD prc_3 = new Procesadores_AMD(12,"AMD4","Ryzer 3 3200G",4,60,2,false);
        Procesadores_moviles movile_1 = new Procesadores_moviles(true,"Chip",2,20,2.5);
        Procesadores_escritorio escritorio_1 = new Procesadores_escritorio(7,"AMD4","Ryzer 5 5600x",16,65,3.5);




    }

}