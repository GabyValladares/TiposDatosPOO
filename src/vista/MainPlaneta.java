/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Planeta;

/**
 *
 * @author Usuario
 */
public class MainPlaneta {

    public static void main(String args[]) {
        //1. DECLARAR/INSTANCIAR OBJETO
        Planeta p1 = new Planeta();
        //2.OTORGAR DATOS INICIALES AL OBJETO
        p1.setNombre("Tierra");
        p1.setCantidadSatelites(1);
        p1.setMasa(59000000000000000000000.00);
        p1.setVolumen(1800000000000000000000.00);
        p1.setDiametro(12742);
        p1.setDistanciaSol(150000000);
        p1.setTipoPlaneta("Terrestre");
        p1.setObservable(true);
        //3.CONSUMIR MÉTODOS
        // p1.imprimir();
        // p1.calcularDensidad();
        //4.INSTANCIONDO CLASE SCANNER
        Scanner en = new Scanner(System.in);
        System.out.println("Ingrese el número de planetas a completar:");
        int v=0;
       // do{
        int numPlanetas=en.nextInt();
        //}while()
        for (int i = 1; i <=numPlanetas; i++) {            
       
        Planeta p = new Planeta();
        System.out.println("INGRESE DATOS DEL PLANETA");
        System.out.println("Ingrese nombre:");
        p.setNombre(en.next());
        System.out.println("Ingrese cantidad de satélites:");
        p.setCantidadSatelites(en.nextInt());
        System.out.println("Ingrese masa:");
        p.setMasa(en.nextDouble());
        System.out.println("Ingrese volumen:");
        p.setVolumen(en.nextDouble());
        System.out.println("Ingrese diámetro:");
        p.setDiametro(en.nextInt());
        System.out.println("Ingrese la distancia del sol:");
        p.setDistanciaSol(en.nextInt());
        System.out.println("Ingrese tipo de planeta:");
        p.setTipoPlaneta(en.next());
        System.out.println("Ingrese es observable:");
        p.setObservable(en.nextBoolean());
        System.out.println("***************");
        p.imprimir();
        p.calcularDensidad(); }
    }

}
