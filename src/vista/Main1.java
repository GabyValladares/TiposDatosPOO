/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

/**
 *
 * @author Usuario
 */
//1.-CONSUMIENTO OBJETOS
public class Main1 {
    //2.-LLAMAR A MÉTODO MAIN TRADUCTOR 
    //O INTERPRETE DEL CÓDIGO 
    //PROBAR EL CÓDIGO
    
    public static void main(String[] args) {
        //1.-CREAR/INSTANCIAR/DECLARAR OBJETO
        //NombreClase nombreObjeto=new NombreClase();
        Persona gaby=new Persona();
        //2.-DARLE/INCIALIZARLE DATOS
        //nombreObjeto.atributo/variable="dato";
       //ACCEDIENDO A LOS ATRIBUTOS
        gaby.idPersona=001;
        gaby.nombres="Gabriela";
        gaby.apellidos="Valladares";
        gaby.etnia="mestiza";
        gaby.cedula=1003297792;
        gaby.numeroTelefono=992937736;
        //ACCEDIENDO A LOS MÉTODOS
        gaby.saludar();
        //CONSUMIENTO MÉTODO (EL DATO DENTRO DE LOS PARÉNTESIS SE LLAMA PARÁMETROS ) 
        gaby.saludarEdad(1);
        
        //NUEVO OBJETO
        Persona a=new Persona();
        a.nombres="Edgar";
        a.compararVolcal();
        a.nombres="Ulpiano";
        a.compararVolcal("Ola de mar");
        
        
//        Persona 
    }
}
