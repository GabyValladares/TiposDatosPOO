package modelo;

/**
 *
 * @author PEpito Pérez
 */
//1.-NOMBRE DE LA CLASE:
public class Persona {
    //2.-ATRIBUTOS ->DECLARACIÓN GLOBAL DE VARIABLES
    //public-private-protected
    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numeroTelefono;
    
    //3.-MÉTODOS/ACCIONES/COMPORTAMIENTOS
     //public-private
    //1)MÉTODO DE NO RETORNO
    //SON SECCIONES DE CÓDIGO
    //PUEDEN POSEER VARIABLES LOCALES
    
    //SOBRECARGA: +2 métodos con el mismo nombre
    //pero con diferente implementación (código o contenido)
    
    //3.1 MÉTODOS CONSTRUCTORES
    //Constructor es la inicialización de valores de un objeto
    //vacio : inicializa los atributos que el usuario desee
    public Persona(){
        
    }
    //3.2 MÉTODOS CONSTRUCTORES CON ATRIBUTOS
    //ARGUMENTOS : los cuales son obligatiorios
    public Persona(int idPersona, 
            String nombres, String apellidos, String etnia, 
            int cedula, int numeroTelefono){
        //PUNTERO THIS: Apunta a un atributo global de la clase trabajada
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.etnia = etnia;
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;
    }
    
    public Persona(int idPersona, 
            String nombres, String apellidos){
        //PUNTERO THIS: Apunta a un atributo global de la clase trabajada
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public void saludar(){
        //MOSTRAR INFORMACIÓN RECURRIR A IMPRIMIR
        System.out.println("HOLA:"+nombres);
    }
    
    //1.1)MÉTODO DE NO RETORNO UTILIZAR ARGUMENTOS DE ENTRADA
    //UN ARGUMENTO ES UNA VARIABLE LOCAL
    //QUE SE DECLARA DENTRO DE LOS ()
    //SOLO SE RECONOCE EN ESE BLOQUE DE CÓDIGO
    public void saludarEdad(int edad){
        if(edad>18){
            System.out.println("Hola Mayor de Edad");
        }else{
            System.out.println("Hola Menor de Edad");
            }
    }
    
    //MÉTODO 1 QUE NOS INDIQUE EL HORÓSCOPO
    public void horoscopo(String signoZodiacal){
        if(signoZodiacal=="Aries"){
            System.out.println("Encontrarás al amor de tu vida en el "
                    + "asensor.");
        }else if(signoZodiacal=="Tauro"){
            System.out.println("Mañana vas a pisar caca de perro.");
        }else if(signoZodiacal=="Géminis"){
            System.out.println("Encontrarás a la persona que extrañas "
                    + "sentada en el parque.");
        }else if(signoZodiacal=="Cáncer"){
            System.out.println("Te va a caer caca de pájaro.");
        }else if(signoZodiacal=="Leo"){
            System.out.println("Te ahogarás con agua.");
        }else if(signoZodiacal=="Virgo"){
            System.out.println("Mañana te encontrarás con el amor "
                    + "de tu vida.");
        }else if(signoZodiacal=="Libra"){
            System.out.println("Te escribirá la persona que gusta.");
        }else if(signoZodiacal=="Escorpio"){
            System.out.println("Ganarás la loteria.");
        }else if(signoZodiacal=="Sagitario"){
            System.out.println("Te caerás en un charco de agua.");
        }else if(signoZodiacal=="Capricornio"){
            System.out.println("Verás pasar a un burro volador.");
        }else if(signoZodiacal=="Acuario"){
            System.out.println("Mañana tu mejor amigo te traicionará.");
        }else if(signoZodiacal=="Piscis"){
            System.out.println("Se te ensuciará tu pantalón favorito.");
        }else{
            System.out.println("No es posible dar un horoscopo debido "
                    + "a que no existe registro de ese signo zodiacal.");
        }
    }
    
    //MÉTODO DE NO RETORNO QUE PERMITA COMPROBAR LA PRIMERA LETRA
    public void comprobarVocal(){
        if((nombres.charAt(0)=='A') || 
                (nombres.charAt(0)=='E') || 
                (nombres.charAt(0)=='I') || 
                (nombres.charAt(0)=='O') || 
                (nombres.charAt(0)=='U')){
            System.out.println("El nombre inicia en una vocal");
        }
    }
    
    //MÉTODO DE NO RETORNO QUE COMPRUEBE UNA ORACION
    public void comprobarVocal(String oracion){
        if((oracion.charAt(0)=='A') || 
                (oracion.charAt(0)=='E') || 
                (oracion.charAt(0)=='I') || 
                (oracion.charAt(0)=='O') || 
                (oracion.charAt(0)=='U')){
            System.out.println("La oración inicia en una vocal");
        }
    }
}
