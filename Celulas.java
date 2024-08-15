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
    

    public void setVida(){
        vida=random.nextInt(2);
    }

    public int getVida(){
        return vida;
    }

    public static void main(String[] args) {

        Celulas c1 = new Celulas();
        Celulas c2 = new Celulas();
        Celulas c3 = new Celulas();

        Tablero t1 = new Tablero();

        t1.addCelulas(c1);
        t1.addCelulas(c2);
 

        c1.setVida();
        c2.setVida();
        c3.setVida();
        
        
       
        System.out.println("La celula es:" + c3.getVida());
        System.out.println(t1.getListaCelulas());
    }

}