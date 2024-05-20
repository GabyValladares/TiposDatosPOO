/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Planeta {
    //1.ATRIBUTOS PRIVADO
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private String tipoPlaneta;
    private boolean observable;
    //2.-CONSTRUCTORES
    public Planeta(){}
    public Planeta(String nombre1,
            int cantidadSatelites,
            double masa,
            double volumen,
            int diametro,
            int distanciaSol,
            String tipoPlaneta,
            boolean observable){
        this.nombre=nombre1;
        this.cantidadSatelites=cantidadSatelites;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.distanciaSol=distanciaSol;
        this.tipoPlaneta=tipoPlaneta;
        this.observable=observable;
    }   
    //3.ENCAPSULAMIENTO
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public int getCantidadSatelites(){
        return cantidadSatelites;
    }
    public void setCantidadSatelites(int n){
        this.cantidadSatelites=n;
    }
      public int getDiametro(){
        return diametro;
    }
    public void setDiametro(int n){
        this.diametro=n;
    }
      public double getMasa(){
        return masa;
    }
    public void setMasa(int n){
        this.masa=n;
    }
    public double getVolumen(){
        return volumen;
    }
    public void setVolumen(int n){
        this.volumen=n;
    }
      public int getDistanciaSol(){
        return distanciaSol;
    }
    public void setDistanciaSol(int n){
        this.distanciaSol=n;
    }
    
    public String getTipoPlaneta(){
        return tipoPlaneta;
    }
    public void setTipoPlaneta(String n){
        this.tipoPlaneta=n;
    }
    public boolean getObservable(){
        return observable;
    }
    public void setObservable(boolean n){
        this.observable=n;
    }
    
    public void imprimir(){
        System.out.println("Datos Planeta\n"+
                "Nombre:"+getNombre()+"\n"+
                "Cantidad Satélitas"+getCantidadSatelites()+"\n"+
                "Masa:"+getMasa()+"\n"+
                "Volumen:"+getVolumen()+"\n"+
                "Diámetro:"+getDiametro()+"\n"+
                "Distancia al Sol:"+getDistanciaSol()+"\n"+
                "Tipo de Planeta:"+getTipoPlaneta()+"\n"+
                "¿Es Observable?:"+getObservable());
    }
    
}
