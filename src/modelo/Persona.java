package modelo;

public class Persona {

    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numeroTelefono;

    public void saludar() {
        System.out.println("HOLA: " + nombres);
    }

    public void saludarEdad(int edad) {
        if (edad > 18) {
            System.out.println("Hola Mayor de Edad");
        } else {
            System.out.println("Hola Menor de Edad");
        }
    }

    public void horoscopo(int mes, int dia) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries: Activo, enérgico, dinámico, impulsivo.");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro: Confiado, paciente, práctico, obstinado.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Géminis: Versátil, expresivo, curioso, inconstante.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cáncer: Emotivo, protector, intuitivo, voluble.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo: Creativo, orgulloso, dominante, generoso.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo: Analítico, práctico, reservado, crítico.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra: Diplomático, justo, sociable, indeciso.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio: Apasionado, intenso, obstinado, reservado.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario: Optimista, aventurero, independiente, sincero.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio: Ambicioso, prudente, paciente, reservado.");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario: Original, independiente, humanitario, impredecible.");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis: Sensible, compasivo, creativo, evasivo.");
        } else {
            System.out.println("Fecha de nacimiento fuera de rango.");
        }
    }

    public void comprobarVocal() {
        if (nombres.charAt(0) == 'A' ||
                nombres.charAt(0) == 'E' ||
                nombres.charAt(0) == 'I' ||
                nombres.charAt(0) == 'O' ||
                nombres.charAt(0) == 'U') {
            System.out.println("El nombre " + nombres + " inicia en una vocal");
        }
    }
}
