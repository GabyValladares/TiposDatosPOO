package modelo;

/**
 *
 * @author PEpito Pérez
 */
//1.-NOMBRE DE LA CLASE:
public class PersonaEncapsulamiento {
//2.-ATRIBUTOS ->DECLARACIÓN GLOBAL DE VARIABLES
    //public-private-protected

    private int idPersona;
    private String nombres;
    private String apellidos;
    private String etnia;
    private int cedula;
    private int numeroTelefono;
    //3.-MÉTODOS/ACCIONES/COMPORTAMIENTOS
    //public-private
    //1)MÉTODO DE NO RETORNO
    //SON SECCIONES DE CÓDIGO
    //PUEDEN POSEER VARIABLES LOCALES

    //3.1 MÉTODOS CONSTRUCTORES
    //SOBRECARGA: +2 MÉTODOS CON EL MISMO NOMBRE
    //PERO CON DIFERENTE IMPLEMENTACIÓN
    //Constructor es la inicialización de valores de un objeto
    //vacío : de inicializar los atributos que el usuario quiera
    public PersonaEncapsulamiento() {
    }

    //argumentos:cuales son atributos obligatorios
    public PersonaEncapsulamiento(int idPersona, String nombres, String apellidos, String etnia, int cedula, int numeroTelefono) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.etnia = etnia;
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;

    }

    public PersonaEncapsulamiento(int idPersona, String nombres, String apellidos) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;

    }
    //3.2 METODOS DE ENCAPSULAMIENTO
    // ENCAPSULAMIENTO ES GENERAR PERMISOS DE ESCRITURA Y LECTURA A LOS OBJETOS
    public int getIdPersona() {
        return idPersona;

    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;

    }
    public String getNombres() {
        return nombres;

    }

    public void setNombres(String nombres) {
        this.nombres = nombres;

    }

    public String getApellidos() {
        return apellidos;

    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public String getEtnia() {
        return etnia;

    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;

    }

    public int getCedula() {
        return cedula;

    }

    public void setCedula(int cedula) {
        this.cedula = cedula;

    }

    public int getNumeroTelefono() {
        return numeroTelefono;

    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    //3.3 MÉTODOS DE REGLA DE NEGOCIO
    //IMPRIMIR
    public void imprimir(){
        System.out.println("DATOS PERSONA"+"\n"+
                "Id:"+getIdPersona()+"\n"+
                "Nombres:"+getNombres()+"\n"+
                "Apellidos:"+getApellidos()+"\n"+
                "Etnia:"+getEtnia()+"\n"+
                "Número de Cédula:"+getCedula()+"\n"+
                "Número de Teléfono:"+getNumeroTelefono());
    
    
    }
    public void saludar() {
        //MOSTRAR INFORMACIÓN RECURRIR A IMPRIMIR
        System.out.println("HOLA:" + nombres);
    }

    //1.1)MÉTODO DE NO RETORNO UTILIZAR ARGUMENTOS DE ENTRADA
    //UN ARGUMENTO ES UNA VARIABLE LOCAL
    //QUE SE DECLARA DENTRO DE LOS ()
    //SOLO SE RECONOCE EN ESE BLOQUE DE CÓDIGO
    public void saludarEdad(int edad) {
        if (edad > 18) {
            System.out.println("Hola Mayor de Edad");
        } else {
            System.out.println("Hola Menor de Edad");
        }
    }

    public void verificarHoroscopo(String signoZodiaco) {

        if (signoZodiaco == "Aries") {
            System.out.println("Aries hoy te ganaras la lotería");
        } else if (signoZodiaco == "Cancer") {
            System.out.println("Cancer hoy te ganaras la lotería");
        } else if (signoZodiaco == "Escorpio") {
            System.out.println("Escorpio hoy te ganaras la lotería");
        } else if (signoZodiaco == "Libra") {
            System.out.println("Libra hoy te ganaras la lotería");
        } else if (signoZodiaco == "Leo") {
            System.out.println("Leo hoy te ganaras la lotería");
        } else if (signoZodiaco == "Géminis") {
            System.out.println("Géminis hoy te ganaras la lotería");
        } else if (signoZodiaco == "Sagitario") {
            System.out.println("Sagitario hoy te ganaras la lotería");
        } else if (signoZodiaco == "Virgo") {
            System.out.println("Virgo hoy te ganaras la lotería");
        } else if (signoZodiaco == "Sagitario") {
            System.out.println("Sagitario hoy te ganaras la lotería");
        } else if (signoZodiaco == "Acuario") {
            System.out.println("Acuario hoy te ganaras la lotería");
        } else if (signoZodiaco == "Capricornio") {
            System.out.println("Capricornio hoy te ganaras la lotería");
        } else if (signoZodiaco == "Piscis") {
            System.out.println("Piscis hoy te ganaras la lotería");
        }

    }

    public void comprobarVocal() {
        if ((nombres.charAt(0) == 'A')
                || (nombres.charAt(0) == 'E')
                || (nombres.charAt(0) == 'I')
                || (nombres.charAt(0) == 'O')
                || (nombres.charAt(0) == 'U')) {
            System.out.println("El nombre :" + nombres + " inicia en una vocal");
        }
    }

    public void comprobarVocal(String oracion) {
        if ((oracion.charAt(0) == 'A')
                || (oracion.charAt(0) == 'E')
                || (oracion.charAt(0) == 'I')
                || (oracion.charAt(0) == 'O')
                || (oracion.charAt(0) == 'U')) {
            System.out.println("La oracion inicia en una vocal");
        }
    }

}
