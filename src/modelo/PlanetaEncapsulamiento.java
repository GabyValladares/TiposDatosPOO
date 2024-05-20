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
    
    //3. MÉTODOS DE ENCAPSULAMIENTO
    //Nombre
    public String getNombre(){
        return nombre;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    //Número de satélites
    public int getNumSatelites(){
        return numSatelites;
        
    }
    
    public void setNumSatelites(int numSatelites){
        this.numSatelites = numSatelites;
    }
    
    //Masa
    public double getMasa(){
        return masa;
        
    }
    
    public void setMasa(double masa){
        this.masa = masa;
    }
    
    //Volumen
    public double getVolumen(){
        return volumen;
        
    }
    
    public void setVolumen(double volumen){
        this.volumen = volumen;
    }
    
    //Diámetro
    public int getDiametro(){
        return diametro;
        
    }
    
    public void setDiametro(int diametro){
        this.diametro = diametro;
    }
    
    //Distancia al Sol
    public int getDisSol(){
        return distSol;
        
    }
    
    public void setDistSol(int distSol){
        this.distSol = distSol;
    }
    
    //Tipo de Planeta
    public String getTipoPlaneta(){
        return tipoPlaneta;
        
    }
    
    public void setTipoPlaneta(String tipoPlaneta){
        this.tipoPlaneta = tipoPlaneta;
        
    }
    
    //Onservable
    public boolean getObservable(){
        return observable;
        
    }
    
    public void setObservable(boolean observable){
        this.observable = observable;
        
    }
    
    //4. MÉTODOS DE REGLA DE NEGOCIO
    public void imprimir(){
        System.out.println("DATOS PLANETA:" + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Nro. Satélites: " + getNumSatelites()+ "\n" +
                "Masa: " + getMasa() + "\n" +
                "Volumen: " + getVolumen()+ "\n" +
                "Diametro: " + getDiametro()+ "\n" +
                "Distancia al Sol: " + getDisSol() + "\n" +
                "Tipo de Planeta: " + getTipoPlaneta() + "\n" +
                "Observable: " + getObservable() + "\n");
    }
}
