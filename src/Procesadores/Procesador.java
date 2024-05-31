package Procesadores;

import java.sql.SQLOutput;

public class Procesador {
    int nucleos;
    double consumo;
    double velocidad;
    String nombre;

    public Procesador() {
    }

    public Procesador(int nucleos, double consumo, double velocidad, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    //setters y getters


    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos personalizados

    public void imprimirDatos(){
        System.out.println("Esta es la clase principal en el primer nivel");
        System.out.println("El nombre del procesador es: "+nombre);
        System.out.println("El consumo del procesador es: "+consumo);
        System.out.println("La velocidad del procesador es: "+velocidad);
        System.out.println("Los nucleos del procesador son: "+nucleos);


    }
}
