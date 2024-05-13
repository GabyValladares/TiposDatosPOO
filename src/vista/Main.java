/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        //TIPO DE DATO 
        //1.- ENTEROS
        //DECLARO CON VALOR
//         int numeroUno=10;//=>public sobreentiende 
//         int numeroDos=8;
        //2.-DECLARO EN 0
        int numeroUno=0;//=>public sobreentiende 
        int numeroDos=0;
         //SOBREESCRIBIR VALOR (REEMPLAZAR)
        numeroUno=8;
        numeroDos=19;
         //1.- SUMA 2 NÚMEROS
         int resultado=numeroUno+numeroDos;
         
         //IMPRIMIR CADENA SALIDA DE INFORMACIÓN
         System.out.println("El resultado es:"+resultado);
    
         //3.- SUMA 2 NÚMEROS , UTILIZAR ENTRADAS Y SALIDAS
         Scanner es=new Scanner(System.in);
         
         System.out.println("Ingrese número 1:");
         //TRANSFORMAR DE UN OBJETO CADENA A UN ENTERO
         int num1=Integer.parseInt(es.next());
           //==int num1=(es.nextInt());
         System.out.println("Ingrese número 2:");
         int num2=es.nextInt();
         //SOBRE ESCRITURA
         num1+=num2;//num1=num1+num2 = resp=num1+num2
         System.out.println("El resultado es:"+num1);
         
         //TRANSFORMANDO DE CADENA A ENTERO
         //1 CADENA = {}DE CARACTERES
         String cadena="La suma de 2 números enteros es:";
          System.out.println("Ingrese número 1:");
         double n1=Double.parseDouble(es.next());
         System.out.println("Ingrese número 2:");
         int n2=es.nextInt();
         //TRANSFORMANDO O CASTEANDO ENTRE DATOS PRIMITIVOS
         int res=(int)n1+n2;
         //DOUBLE RECIBE TANTO ENTEROS COMO DECIMALES
         double resul=n1+n2;
         //+"" Transforma cualquier tipo de dato en cadena
         cadena+=resul+"";
         
         
         
         
         
    }
        
    
    
    
    
}
