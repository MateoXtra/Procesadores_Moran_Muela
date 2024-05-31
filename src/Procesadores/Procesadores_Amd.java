package Procesadores;

public class Procesadores_Amd extends Procesadores_Escritorio{
    boolean sensor_Temp;

    public Procesadores_Amd() {
    }

    public Procesadores_Amd(int nucleos, double consumo, double velocidad, String nombre, String socket, boolean sensor_Temp) {
        super(nucleos, consumo, velocidad, nombre, socket);
        this.sensor_Temp = sensor_Temp;
    }

    public boolean isSensor_Temp() {
        return sensor_Temp;
    }

    public void setSensor_Temp(boolean sensor_Temp) {
        this.sensor_Temp = sensor_Temp;
    }

    //metodos
    public void imprimirDatosAmd(){
        System.out.println("El sensor de temperatura es: " + sensor_Temp);}

    @Override
    public void imprimirDatos() {
        System.out.println("Clase hija AMD");


    }
}