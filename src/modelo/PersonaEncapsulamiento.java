package modelo;

/**
 *
 * @author Alejandro
 */
//1.-NOMBRE DE LA CLASE:
public class PersonaEncapsulamiento {

    //2.-ATRIBUTOS PRIVADOS -> DECLARACIÓN DE VARIABLES
    //public-private-protected
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String etnia;
    private int cedula;
    private int numeroTelefono;

    public PersonaEncapsulamiento() {
    }

    //3.2 MÉTODOS CONSTRUCTORES CON ATRIBUTOS
    //ARGUMENTOS : los cuales son obligatiorios
    public PersonaEncapsulamiento(int idPersona,
            String nombres, String apellidos, String etnia,
            int cedula, int numeroTelefono) {
        //PUNTERO THIS: Apunta a un atributo global de la clase trabajada
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.etnia = etnia;
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;
    }

    public PersonaEncapsulamiento(int idPersona,
            String nombres, String apellidos) {
        //PUNTERO THIS: Apunta a un atributo global de la clase trabajada
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    //3.3 METODOS DE ENCAPSULAMIENTO
    //El encapsulamiento es generar un permiso de escritura o lectura
    //MÉTODO GET (obtener)
    public int getIdPersona() {
        return idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEtnia() {
        return etnia;
    }

    public int getCedula() {
        return cedula;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    //MÉTODO SET 
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    //3.4 MÉTODOS DE REGLA DE NEGOCIO
    
    //MÉTODO IMPRIMIR
    public void imprimir(){
        System.out.println("DATOS PERSONA: " + "\n" +
                "ID Persona: " + getIdPersona() + "\n" +
                "Nombres: " + getNombres() + "\n" + 
                "Apellidos: " + getApellidos() + "\n" +
                "Etnia: " + getEtnia() + "\n" +
                "Nro. Cedula: " + getCedula() + "\n" +
                "Número de Teléfono: " + getNumeroTelefono() + "\n" );
    }
    
    //MÉTODO DE SALUDO
    public void saludar() {
        //MOSTRAR INFORMACIÓN RECURRIR A IMPRIMIR
        System.out.println("HOLA:" + nombres);
    }

    //1.1)MÉTODO DE NO RETORNO UTILIZAR ARGUMENTOS DE ENTRADA
    public void saludarEdad(int edad) {
        if (edad > 18) {
            System.out.println("Hola Mayor de Edad");
        } else {
            System.out.println("Hola Menor de Edad");
        }
    }

    //MÉTODO 1 QUE NOS INDIQUE EL HORÓSCOPO
    public void horoscopo(String signoZodiacal) {
        if (signoZodiacal == "Aries") {
            System.out.println("Encontrarás al amor de tu vida en el "
                    + "asensor.");
        } else if (signoZodiacal == "Tauro") {
            System.out.println("Mañana vas a pisar caca de perro.");
        } else if (signoZodiacal == "Géminis") {
            System.out.println("Encontrarás a la persona que extrañas "
                    + "sentada en el parque.");
        } else if (signoZodiacal == "Cáncer") {
            System.out.println("Te va a caer caca de pájaro.");
        } else if (signoZodiacal == "Leo") {
            System.out.println("Te ahogarás con agua.");
        } else if (signoZodiacal == "Virgo") {
            System.out.println("Mañana te encontrarás con el amor "
                    + "de tu vida.");
        } else if (signoZodiacal == "Libra") {
            System.out.println("Te escribirá la persona que gusta.");
        } else if (signoZodiacal == "Escorpio") {
            System.out.println("Ganarás la loteria.");
        } else if (signoZodiacal == "Sagitario") {
            System.out.println("Te caerás en un charco de agua.");
        } else if (signoZodiacal == "Capricornio") {
            System.out.println("Verás pasar a un burro volador.");
        } else if (signoZodiacal == "Acuario") {
            System.out.println("Mañana tu mejor amigo te traicionará.");
        } else if (signoZodiacal == "Piscis") {
            System.out.println("Se te ensuciará tu pantalón favorito.");
        } else {
            System.out.println("No es posible dar un horoscopo debido "
                    + "a que no existe registro de ese signo zodiacal.");
        }
    }

    //MÉTODO DE NO RETORNO QUE PERMITA COMPROBAR LA PRIMERA LETRA
    public void comprobarVocal() {
        if ((nombres.charAt(0) == 'A')
                || (nombres.charAt(0) == 'E')
                || (nombres.charAt(0) == 'I')
                || (nombres.charAt(0) == 'O')
                || (nombres.charAt(0) == 'U')) {
            System.out.println("El nombre inicia en una vocal");
        }
    }

    //MÉTODO DE NO RETORNO QUE COMPRUEBE UNA ORACION
    public void comprobarVocal(String oracion) {
        if ((oracion.charAt(0) == 'A')
                || (oracion.charAt(0) == 'E')
                || (oracion.charAt(0) == 'I')
                || (oracion.charAt(0) == 'O')
                || (oracion.charAt(0) == 'U')) {
            System.out.println("La oración inicia en una vocal");
        }
    }
}
