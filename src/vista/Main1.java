/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

public class Main1 {

    public static void main(String[] args) {
        Persona tania = new Persona();
        tania.idPersona = 001;
        tania.nombres = "Tania";
        tania.apellidos = "Cacuango";
        tania.etnia = "mestiza";
        tania.cedula = 1003297792;
        tania.numeroTelefono = 992937736;

        tania.saludar();
        tania.saludarEdad(18);
        tania.horoscopo(11, 21);
        tania.comprobarVocal(); // Llama al método para comprobar si el nombre inicia en vocal

        Persona deiby = new Persona();
        deiby.idPersona = 002;
        deiby.nombres = "Deiby";
        deiby.apellidos = "tirira";
        deiby.etnia = "blanco";
        deiby.cedula = 1001234567;
        deiby.numeroTelefono = 987654321;

        deiby.saludar();
        deiby.saludarEdad(25);
        deiby.horoscopo(11, 8);
        deiby.comprobarVocal(); // Llama al método para comprobar si el nombre inicia en vocal
    }
}
