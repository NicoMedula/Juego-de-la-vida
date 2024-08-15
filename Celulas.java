/**
 
 Todas las células se actualizan simultáneamente en cada turno, siguiendo estas reglas:

Nace: Si una célula muerta tiene exactamente 3 células vecinas vivas "nace" (es decir, al turno siguiente estará viva).

Muere: una célula viva puede morir por uno de 2 casos:
	1)Sobrepoblación: si tiene más de tres vecinos alrededor.
	2)Aislamiento: si tiene solo un vecino alrededor o ninguno.

Vive: una célula se mantiene viva si tiene 2 o 3 vecinos a su alrededor.


    0 = Celula muerta
    1 = Celula viva

 */

import java.util.Random;
import java.util.ArrayList;


public class Celulas {

    Random random = new Random();
    private int vida;
    int vidaRand = random.nextInt(2);
    

    public void setVida(){
        vida=vidaRand;
    }

    public int getVida(){
        return vida;
    }

    @Override
    public String toString() {

        return String.valueOf(vida); 
    }

    public void getNaceCelula(){
        
    }

    public static void main(String[] args) {
        int i;
        for (i=0; i <4; i++){

        
            Celulas c1 = new Celulas();
            Celulas c2 = new Celulas();
            Celulas c3 = new Celulas();
            Celulas c4 = new Celulas();

            Tablero t1 = new Tablero();


        

            c1.setVida();
            c2.setVida();
            c3.setVida();
            c4.setVida();

            t1.addCelulas(c1);
            t1.addCelulas(c2);
            t1.addCelulas(c3);
            t1.addCelulas(c4);


            System.out.println(t1.getVecinosVivos());
            System.out.println(t1.getListaCelulas());
        
        
        }
    }

}