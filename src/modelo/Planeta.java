/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Planeta {
    public String nombre;
    public int cantidadSatelites;
    public double masa;
    public double volumen;
    public int diametro;
    public int distanciaMediaSol;
    public String tipoPlaneta;
    public boolean observable = false;
    
    public void atributos(){
        System.out.println("El nombre del planeta es: "+ nombre +"\nLa cantidad de satélites es: "
                + cantidadSatelites +"\nLa masa aprox. del planeta es: " + masa + " cuatrillones de Kilogramos "
                + "\nEl volumen aprox. del planeta es: " + volumen + " billon de kilometros cubicos \nEl diámetro aprox. es: " + diametro +
                "km \nLa distancia media al sol es: "+ distanciaMediaSol + " millones de kilometros \nEl tipo de planeta es: " 
                + tipoPlaneta + "\nEs observable: " +observable);
    }    
    public void calcularDen(){
        double densidad=masa/volumen;
        System.out.println("La densidad del planeta es: "+densidad);
    }
    public void atributosJ(){
        System.out.println("El nombre del planeta es: "+ nombre +"\nLa cantidad de satélites es: "
                + cantidadSatelites +"\nLa masa aprox. del planeta es: " + masa + " septillones de Kilogramos "
                + "\nEl volumen aprox. del planeta es: " + volumen + " billones de kilometros cubicos \nEl diámetro "
                        + "aprox. es: " + diametro +
                "km \nLa distancia media al sol es: "+ distanciaMediaSol + " millones de kilometros \nEl tipo de planeta es: " 
                + tipoPlaneta + "\nEs observable: " +observable);  
    }
    public void atributosS(){
        System.out.println("El nombre del planeta es: "+ nombre +"\nLa cantidad de satélites es: "
                + cantidadSatelites +"\nLa masa aprox. del planeta es: " + masa + " quintillones de Kilogramos "
                + "\nEl volumen aprox. del planeta es: " + volumen + " sextillones de kilometros cubicos \nEl diámetro "
                        + "aprox. es: " + diametro +
                "km \nLa distancia media al sol es: "+ distanciaMediaSol + " millones de kilometros \nEl tipo de planeta es: " 
                + tipoPlaneta + "\nEs observable: " +observable);
    }
    public void atributosN(){
        System.out.println("El nombre del planeta es: "+ nombre +"\nLa cantidad de satélites es: "
                + cantidadSatelites +"\nLa masa aprox. del planeta es: " + masa + " septillones de Kilogramos "
                + "\nEl volumen aprox. del planeta es: " + volumen + " billones de kilometros cubicos \nEl diámetro "
                        + "aprox. es: " + diametro +
                "km \nLa distancia media al sol es: "+ distanciaMediaSol + " millones de kilometros \nEl tipo de planeta es: " 
                + tipoPlaneta + "\nEs observable: " +observable);
    }
    public void atributosU(){
        System.out.println("El nombre del planeta es: "+ nombre +"\nLa cantidad de satélites es: "
                + cantidadSatelites +"\nLa masa aprox. del planeta es: " + masa + " sextillones de Kilogramos "
                + "\nEl volumen aprox. del planeta es: " + volumen + " billones de kilometros cubicos \nEl diámetro "
                        + "aprox. es: " + diametro +
                "km \nLa distancia media al sol es: "+ distanciaMediaSol + " millones de kilometros \nEl tipo de planeta es: " 
                + tipoPlaneta + "\nEs observable: " +observable);
    }
}