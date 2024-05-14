package vista;

import modelo.Planeta;

/**
 *
 * @author david
 */
public class Main_planeta {
    public static void main(String[] args) {
        Planeta tierra=new Planeta();
        //OBJETO 1
        tierra.nombre="Tierra";
        tierra.cantidadSatelites=1;
        tierra.diametro=12742;
        tierra.distanciaSol=15;
        tierra.masaKilogramos=6;
        tierra.volumen=1;
        tierra.visible=true;
        tierra.tipoPlaneta="TERRESTRE";
        
        tierra.imprimirAtributos();
        tierra.alcularDensidad();
        System.out.println("--------------------------------------------------");
        //OBJETO 2
        Planeta marte=new Planeta();
        marte.nombre="Marte";
        marte.cantidadSatelites=2;
        marte.diametro=6779;
        marte.distanciaSol=228;
        marte.masaKilogramos=4;
        marte.volumen=0.5;
        marte.visible=false;
        marte.tipoPlaneta="TERRESTRE";
        
        marte.imprimirAtributos();
        marte.alcularDensidad();
        System.out.println("--------------------------------------------------");
        //OBJETO 3
        Planeta jupiter=new Planeta();
        jupiter.nombre="Jupiter";
        jupiter.cantidadSatelites=67;
        jupiter.diametro=139820;
        jupiter.distanciaSol=750;
        jupiter.masaKilogramos=9;
        jupiter.volumen=3;
        jupiter.visible=false;
        jupiter.tipoPlaneta="GASEOSO";
        
        jupiter.imprimirAtributos();
        jupiter.alcularDensidad();
        System.out.println("--------------------------------------------------");
        //OBJETO 4
        Planeta mercurio=new Planeta();
        mercurio.nombre="Mercurio";
        mercurio.cantidadSatelites=0;
        mercurio.diametro=4879;
        mercurio.distanciaSol=58;
        mercurio.masaKilogramos=0.0045;
        mercurio.volumen=5;
        mercurio.visible=false;
        mercurio.tipoPlaneta="TERRESTRE";
        
        mercurio.imprimirAtributos();
        mercurio.alcularDensidad();
        System.out.println("--------------------------------------------------");
        //OBJETO 5
        Planeta venus=new Planeta();
        venus.nombre="Venus";
        venus.cantidadSatelites=0;
        venus.diametro=12104;
        venus.distanciaSol=108;
        venus.masaKilogramos=0.005;
        venus.volumen=4.5;
        venus.visible=false;
        venus.tipoPlaneta="TERRESTRE";
        
        mercurio.imprimirAtributos();
        mercurio.alcularDensidad();
        System.out.println("--------------------------------------------------");
        
      
    }
}
