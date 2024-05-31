package Procesadores;

public class Procesadores_Escritorio extends Procesador {
    String socket;

    public Procesadores_Escritorio() {
    }

    public Procesadores_Escritorio(int nucleos, double consumo, double velocidad, String nombre, String socket) {
        super(nucleos, consumo, velocidad, nombre);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    //metodos Personalizados

    public void imprimirDatosEsctirotio(){
        System.out.println("Socket: " + socket);
        System.out.println(this.socket);

    }

    @Override
    public void imprimirDatos() {
        System.out.println("Computador de escritorio.");
    }
}




