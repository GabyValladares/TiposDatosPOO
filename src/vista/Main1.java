/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;
import modelo.PersonaEncapsulamiento;

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
        //NombreClase nombreObjeto = new NombreClase();
        //Persona alejandro = new Persona();
        Persona personaA = new Persona();
        Persona alejandro = new Persona();
        alejandro.nombres = "Mario";
        
        //NO SE PUEDE TENER EL MISMO NOMBRE DE OBJETO
        //Persona alejandro = new Persona(1001, "Daniel", "Lomas");
        Persona cevallos = new Persona(100, "Alejandro", "Cevallos", "Indígena", 1002003004, 995196339);

        //2.- DARLE DATOS AL OBJETO
        //nombreObjeto.atributo/variable = "dato";
        //acceder a atributos
        //Objecto 1
//        alejandro.idPersona = 001;
//        alejandro.nombres = "Alejandro";
//        alejandro.apellidos = "Cevallos";
//        alejandro.etnia = "Mestizo";
//        alejandro.cedula = 1004587919;
//        alejandro.numeroTelefono = 995196339;
//        
//            //acceder a los métodos
//        alejandro.saludar();
//            //EL DATO DENTRO DEL PARANTESIS ES UN PARÁMETRO
//        alejandro.saludarEdad(18);
//        alejandro.horoscopo("Géminis");
//        alejandro.comprobarVocal();
        //Objecto 2
//        personaA.idPersona = 002;
//        personaA.nombres = "Esdwin";
//
//        //Metodos
//        personaA.comprobarVocal();
//        personaA.comprobarVocal("Hoy es Miercoles");
        
        
        
        //CREACIÓN OBJETO DE MODELO PERSONAENCAPSULAMIENTO
        PersonaEncapsulamiento personaX = new PersonaEncapsulamiento();
        personaX.setNombres("David");
        personaX.imprimir();
        
    }
}
