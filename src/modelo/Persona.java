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
    public void verificarHoroscopo(String signoZodiaco){
    
        if(signoZodiaco=="Aries"){
            System.out.println("Aries hoy te ganaras la lotería");
        }else if(signoZodiaco=="Cancer"){
            System.out.println("Cancer hoy te ganaras la lotería");
        }else if(signoZodiaco=="Escorpio"){
            System.out.println("Escorpio hoy te ganaras la lotería");
        }else if(signoZodiaco=="Libra"){
            System.out.println("Libra hoy te ganaras la lotería");
        }
        else if(signoZodiaco=="Leo"){
            System.out.println("Leo hoy te ganaras la lotería");
        }else if(signoZodiaco=="Géminis"){
            System.out.println("Géminis hoy te ganaras la lotería");
        }else if(signoZodiaco=="Sagitario"){
            System.out.println("Sagitario hoy te ganaras la lotería");
        }
        else if(signoZodiaco=="Virgo"){
            System.out.println("Virgo hoy te ganaras la lotería");
        }else if(signoZodiaco=="Sagitario"){
            System.out.println("Sagitario hoy te ganaras la lotería");
        }else if(signoZodiaco=="Acuario"){
            System.out.println("Acuario hoy te ganaras la lotería");
        }else if(signoZodiaco=="Capricornio"){
            System.out.println("Capricornio hoy te ganaras la lotería");
        }else if(signoZodiaco=="Piscis"){
            System.out.println("Piscis hoy te ganaras la lotería");
        }
        
    }
    
    public void comprobarVocal(){
        if((nombres.charAt(0)=='A')||
                (nombres.charAt(0)=='E')||
                (nombres.charAt(0)=='I')||
                (nombres.charAt(0)=='O')||
                (nombres.charAt(0)=='U')){
            System.out.println("El nombre :"+ nombres +" inicia en una vocal");
        }
       }
    
    public void comprobarVocal(String oracion){
        if((oracion.charAt(0)=='A')||
                (oracion.charAt(0)=='E')||
                (oracion.charAt(0)=='I')||
                (oracion.charAt(0)=='O')||
                (oracion.charAt(0)=='U')){
            System.out.println("La oracion inicia en una vocal");
        }
       }
    
    
    
    
    
}