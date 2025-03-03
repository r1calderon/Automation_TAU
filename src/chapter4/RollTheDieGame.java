package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {

          // Inicializamos lo que ya sabemos
        int numeroDeEspacios = 20;
        int tiradasDeDados = 5;
        int posicionActual = 0;


        for(int i=0; i<tiradasDeDados; i++) {

            Random random = new Random();
            int dado = random.nextInt(6) + 1;
            posicionActual = posicionActual + dado;

            if (posicionActual == 20) {
                System.out.println("Tirada #" + (i + 1) + " tiraste un: " + dado + " estas en el espacio: " + posicionActual + " y te faltan: " + (numeroDeEspacios - dado) + " para ganar");
                System.out.println("Llegaste a 20 puntos, GANASTE");
                break;
            }

            if(posicionActual < 20) {
                System.out.println("Tirada #" + (i + 1) + " tiraste un: " + dado + " estas en el espacio: " + posicionActual + " y te faltan: " + (numeroDeEspacios - dado) + " para ganar");
                numeroDeEspacios = numeroDeEspacios - dado;
                if(i==4){
                    System.out.println("No lograste los 20 puntos, PERDISTE");
                }
            }

            if ( posicionActual > 20){
                System.out.println("Tirada #" + (i + 1) + " tiraste un: " + dado);
                System.out.println("Sobrepasaste los 20 puntos, PERDISTE");
                    break;
                }
            }
            }
            }




