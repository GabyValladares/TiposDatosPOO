package modelo;

/**
 *
 * @author Alejandro
 */
public class Planetas {

    //1. DEFINIR ATRIBUTOS
    public String nombre;
    public int numSatelites;
    public double masa;
    public double volumen;
    public int diametro;
    public int distSol;
    public int tipoPlaneta;
    public boolean observable;

    //2. MÉTODOS
    public void imprimirAtrib() {
        System.out.println("El planeta " + nombre
                + " tiene las siguientes características:");
        System.out.println("Numero de satelites: " + numSatelites);
        System.out.println("Masa: " + masa + "kg");
        System.out.println("Volumen: " + volumen + "km3");
        System.out.println("Diámetro: " + diametro + "km");
        System.out.println("Distancia media al Sol: " + distSol + "km");

        switch (tipoPlaneta) {
            case 1 ->
                System.out.println("Tipo de planeta: Gaseoso");
            case 2 ->
                System.out.println("Tipo de planeta: Terrestre");
            case 3 ->
                System.out.println("Tipo de planeta: Enano");
            default ->
                System.out.println("Tipo de planeta: Desconocido");
        }

        System.out.println("¿Observable? " + observable);
    }

    public double calcDensidad() {
        double densidad = masa / volumen;
        return densidad;
    }
}
