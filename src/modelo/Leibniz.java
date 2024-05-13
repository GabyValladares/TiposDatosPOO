/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Leibniz {
    //GENERAR UN MÉTODO DE NO RETORNO CON ARGUMENTO QUE PERMITA CALCULAR LEIBNIZ
    public void calcularLeibniz(int num){
        //acumulador:almacenar información incremental
        double res=0;
        //auxiliar de iteración
        int denom=1;
        //constante
        final int NUM=4;
        //bandera:signo 1->sumar y 2->restar
        int signo=1;
        //iteración
        for (int i = 0; i < num; i++) {
            if(signo==1){
            //res+=(NUM/denom)+res;
            res=(NUM/denom)+res;
            System.out.printf("Suma: %d / %d", NUM, denom);
                signo=2;
                denom+=2;
            }else{
                res=res-(NUM/denom);
                System.out.printf("Resta: %d / %d", NUM, denom);
                signo=1;
                denom+=2;
            }
        }
        
        System.out.println("La aproximación es:"+res);
    
    }
    
    public static void main(String[] args) {
        Leibniz prueba1=new Leibniz();
        prueba1.calcularLeibniz(7);
    }
    
}
