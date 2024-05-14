package modelo;

/**
 *
 * @author david
 */
public class Planeta {
    public String nombre;
    public int cantidadSatelites;
    public double masaKilogramos;
    public int diametro;
    public int distanciaSol;
    public boolean visible;
    public String tipoPlaneta;
    public double densidad;
    public double volumen;
    
    public void imprimirAtributos(){
        System.out.print("Los datos de "+nombre+" son:\n"
                        + "Cantidad de satelites naturales:"+cantidadSatelites+" satelites\n"
                        +"Una masa de: "+masaKilogramos+" cuatrillones de Kilogramos\n"
                        +"Un volumen de: "+volumen+" billon de kilometros cubicos\n"
                        +"Un diametro de: "+diametro+" Kilometros\n"
                        +"Una distancia media al sol es de: "+distanciaSol+" millones de kilometros\n"
                        +"Tipo de planeta: "+tipoPlaneta+"\n"
                        +"Observable a simple vista: "+visible+"\n");
    }
    public void alcularDensidad(){
        densidad=(masaKilogramos/volumen);
        System.out.println("La densidad de este planeta es de: "+densidad+" kl/m3");
    }
}