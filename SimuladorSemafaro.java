/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorsemafaro;


/**
 *
 * @author Jaqueline Oliveira
 */
public class SimuladorSemafaro {

    public static void main(String[] args) {

        ThreadSemafaro semafaro = new ThreadSemafaro();

        for (int i = 0; i < 10; i++) {

            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();

        }
        
        semafaro.desligarSemafaro();

    }
}
