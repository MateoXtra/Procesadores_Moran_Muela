package Procesadores;

import Procesadores.Procesador;

public class Procesadores_moviles extends Procesador {
    boolean optimizacion_energia;

    public Procesadores_moviles(){}


    public Procesadores_moviles(int nucleos, double consumo, double velocidad, String nombre, boolean optimizacion_energia) {
        super(nucleos, consumo, velocidad, nombre);
        this.optimizacion_energia = optimizacion_energia;
    }

    public boolean isOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    //metodos Personalizados

    public void imprimirDatosMoviles(){
        System.out.println("Optimizacion de energia: " + optimizacion_energia);
        System.out.println(this.optimizacion_energia);

    }
}
