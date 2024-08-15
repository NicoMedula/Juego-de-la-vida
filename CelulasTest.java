import java.util.ArrayList;

import org.junit.Test;

import Celulas.Tablero;

/**
 
 Todas las células se actualizan simultáneamente en cada turno, siguiendo estas reglas:

Nace: Si una célula muerta tiene exactamente 3 células vecinas vivas "nace" (es decir, al turno siguiente estará viva).

Muere: una célula viva puede morir por uno de 2 casos:
	1)Sobrepoblación: si tiene más de tres vecinos alrededor.
	2)Aislamiento: si tiene solo un vecino alrededor o ninguno.

Vive: una célula se mantiene viva si tiene 2 o 3 vecinos a su alrededor.

 */


public class CelulasTest {
    
    @Test
    public void estado_de_una_celula_Test(){

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida();
        c2.setVida();
        c3.setVida();
        c4.setVida();

        

        assert c3.getVida()==0;
    

    }

    @Test
    public void nace_una_celula_Test(){






    }
    
}
