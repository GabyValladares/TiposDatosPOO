/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Planeta;

/**
 *
 * @author LENOVO
 */
public class MainPlaneta {
    public static void main(String[] args) {
        Planeta tierra=new Planeta();
        tierra.nombre="Tierra";
        tierra.cantidadSatelites=1;
        tierra.masa=5.9;
        tierra.volumen=1;
        tierra.diametro=12650;
        tierra.distanciaMediaSol=15;
        tierra.tipoPlaneta="TERRESTRE";
        tierra.observable=true;
        
        tierra.atributos();
        tierra.calcularDen();
        
        Planeta jupiter=new Planeta();
        jupiter.nombre="Júpiter";
        jupiter.cantidadSatelites=95;
        jupiter.masa=1.898;
        jupiter.volumen=1.4;
        jupiter.diametro=139820;
        jupiter.distanciaMediaSol=750;
        jupiter.tipoPlaneta="GASEOSO";
        jupiter.observable=true;
        
        jupiter.atributosJ();
        jupiter.calcularDen();

        Planeta saturno=new Planeta();
        saturno.nombre="Saturno";
        saturno.cantidadSatelites=24;
        saturno.masa=5.683;
        saturno.volumen=8.27;
        saturno.diametro=16460;
        saturno.distanciaMediaSol=1418;
        saturno.tipoPlaneta="GASEOSO";
        saturno.observable=true;
        
        saturno.atributosS();
        saturno.calcularDen();
        
        Planeta neptuno=new Planeta();
        neptuno.nombre="Neptuno";
        neptuno.cantidadSatelites=16;
        neptuno.masa=1.024;
        neptuno.volumen=6.254;
        neptuno.diametro=42244;
        neptuno.distanciaMediaSol=4500;
        neptuno.tipoPlaneta="GASEOSO";
        neptuno.observable=false;
        
        neptuno.atributosN();
        neptuno.calcularDen();
        
        Planeta urano=new Planeta();
        urano.nombre="Urano";
        urano.cantidadSatelites=28;
        urano.masa=8.681;
        urano.volumen=6.83;
        urano.diametro=50724;
        urano.distanciaMediaSol=3000;
        urano.tipoPlaneta="GASEOSO";
        urano.observable=true;
        
        urano.atributosU();
        urano.calcularDen();
    }    
}
