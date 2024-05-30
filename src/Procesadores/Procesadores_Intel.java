package Procesadores;

public class Procesadores_Intel extends Procesadores_Escritorio{
    boolean grafica_integrada;

    public Procesadores_Intel() {
    }

    public Procesadores_Intel(int nucleos, double consumo, double velocidad, String nombre, boolean grafica_integrada) {
        super(nucleos, consumo, velocidad, nombre);
        this.grafica_integrada = grafica_integrada;
    }

    public boolean isGrafica_integrada() {
        return grafica_integrada;
    }

    public void setGrafica_integrada(boolean grafica_integrada) {
        this.grafica_integrada = grafica_integrada;
    }

    //metodos Personalizados

    public void ImprimirdatosGraficos(){
        System.out.println("Grafica presente: " + grafica_integrada);
        System.out.println(this.grafica_integrada);

    }
}
