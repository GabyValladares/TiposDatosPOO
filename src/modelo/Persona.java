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
    
    
    //3.1 METODO CONSTRUCTOR
    // inicializacion de valores de un objeto
    //SOBRECARGA: dos o mas metosos con el mismo nombre 
    // con diferente implentacion 
    // no se declara ni publico ni privado 
    //permite inicializar con datos o no 
    //SOBREESCRITURA: cambiar o modificar el valor de una variable
    //inicializar un valor especifico de un objeto 
    public Persona(){
    
    }
    // con argumentos: cuales son los atributos obligatorios 
    public Persona(int idPersona, String nombre, String apellidos,String etnia,int cedula,int numeroTelefono ){
        //this: puntero que hace que el valor de la variable goblar se sobreescriba con lo de la variable local 
        this.idPersona=idPersona;
        this.nombres=nombre;
        this.apellidos=nombre;
        this.etnia=etnia;
        this.cedula=cedula;
        this.numeroTelefono=numeroTelefono;
    }
     public Persona(int idPersona, String nombre, String apellidos){
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
        public void compararVolcal(){
            if ((nombres.charAt(0)=='A')||
                    (nombres.charAt(0)=='E')||
                    (nombres.charAt(0)=='I')||
                    (nombres.charAt(0)=='O')||
                    (nombres.charAt(0)=='U')){
                System.out.println("El nombre: "+nombres+"empieza con vocal");
            }
        
        }  
        public void compararVolcal(String oracion){
            if ((oracion.charAt(0)=='A')||
                    (oracion.charAt(0)=='E')||
                    (oracion.charAt(0)=='I')||
                    (oracion.charAt(0)=='O')||
                    (oracion.charAt(0)=='U')){
                System.out.println("El nombre: "+oracion+"empieza con vocal");
            }
        
        }
 }
    

