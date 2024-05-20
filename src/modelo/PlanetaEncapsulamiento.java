/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class PlanetaEncapsulamiento {
    
    //1. DEFINIR ATRIBUTOS
    private String nombre;
    private int numSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distSol;
    private String tipoPlaneta;
    private boolean observable;
    
    //2. MÉTODOS CONSTRUCTORES
    public PlanetaEncapsulamiento(){}
    
    public PlanetaEncapsulamiento(String nombre, 
            int numSatelites, 
            double masa,
            double volumen, 
            int diametro, 
            int distSol, 
            String tipoPlaneta, 
            boolean observable){
        
        this.nombre = nombre;
        this.numSatelites = numSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distSol = distSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }
    
    //3. 
    
}
