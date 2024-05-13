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
            double termino = 4.0 / (2 * i + 1); // Calcula el término de la serie
            if (i % 2 == 0) {
                res += termino; // Suma el término si i es par
            } else {
                res -= termino; // Resta el término si i es impar
            }
        }

        // Imprimir la aproximación
        System.out.println("La aproximación de pi con " + num + " términos es: " + res);
    }

    public static void main(String[] args) {
        Leibniz leibniz = new Leibniz();
        leibniz.calcularLeibniz(10);
    }
}
