/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Planetas;

/**
 *
 * @author Alejandro
 */
public class Main2 {
    public static void main(String[] args) {
        
        double densidad = 0;
        
        //Objeto 1
        Planetas tierra = new Planetas();
        //Objeto 2
        Planetas marte = new Planetas();
        //Objeto 3
        Planetas pluton = new Planetas();
        //Objeto 4
        Planetas urano = new Planetas();
        //Objeto 5
        Planetas jupiter = new Planetas();
        
        //Obj 1
            //Attr
            tierra.nombre = "Tierra";
            tierra.numSatelites = 1;
            tierra.masa = 600000000;
            tierra.volumen = 10800000;
            tierra.diametro = 12742;
            tierra.distSol = 150000000;
            tierra.tipoPlaneta = 2;
            tierra.observable = true;
            
            //Mtd
            tierra.imprimirAtrib();
            densidad = tierra.calcDensidad();
            System.out.println("La densidad del planeta es: " + densidad + "g/cm3\n");
            
        
        //Obj 2
            //Attr
            marte.nombre = "Marte";
            marte.numSatelites = 2;
            marte.masa = 62300000;
            marte.volumen = 1630000;
            marte.diametro = 6794;
            marte.distSol = 228000000;
            marte.tipoPlaneta = 2;
            marte.observable = true;
            
            //Mtd
            marte.imprimirAtrib();
            densidad = marte.calcDensidad();
            System.out.println("La densidad del planeta es: " + densidad + "g/cm3\n");
            
        //Obj 3
            //Attr
            pluton.nombre = "Plutón";
            pluton.numSatelites = 5;
            pluton.masa = 1300000;
            pluton.volumen = 706000;
            pluton.diametro = 2376;
            pluton.distSol = 591600000;
            pluton.tipoPlaneta = 3;
            pluton.observable = false;
            
            //Mtd
            pluton.imprimirAtrib();
            densidad = pluton.calcDensidad();
            System.out.println("La densidad del planeta es: " + densidad + "g/cm3\n");
            
        //Obj 4
            //Attr
            urano.nombre = "Urano";
            urano.numSatelites = 14;
            urano.masa = 868100000;
            urano.volumen = 6834000;
            urano.diametro = 50724;
            urano.distSol = 300000000;
            urano.tipoPlaneta = 2;
            urano.observable = false;
            
            //Mtd
            urano.imprimirAtrib();
            densidad = urano.calcDensidad();
            System.out.println("La densidad del planeta es: " + densidad + "g/cm3\n");
        
        //Obj 5
            //Attr
            jupiter.nombre = "Júpiter";
            jupiter.numSatelites = 95;
            jupiter.masa = 1898000000;
            jupiter.volumen = 14310000;
            jupiter.diametro = 139820;
            jupiter.distSol = 750000000;
            jupiter.tipoPlaneta = 1;
            jupiter.observable = true;
            
            //Mtd
            jupiter.imprimirAtrib();
            densidad = jupiter.calcDensidad();
            System.out.println("La densidad del planeta es: " + densidad + "g/cm3\n");
    }
}
