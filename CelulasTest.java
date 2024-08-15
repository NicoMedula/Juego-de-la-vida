import java.util.ArrayList;

import org.junit.Test;



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


        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida();
        c2.setVida();
        c3.setVida();
        c4.setVida();

        assert c1.getVida() == 1 || c1.getVida()==0;
        assert c2.getVida() == 1 || c2.getVida()==0;
        assert c3.getVida() == 1 || c3.getVida()==0;
        assert c4.getVida() == 1 || c4.getVida()==0;
        

    }

    @Test
    public void vecino_vivo_Test(){

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida();
        c2.setVida();
        c3.setVida();
        c4.setVida();

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getVecinosVivos() == 2;
        
        


    }

    @Test
    public void vecino_muerto_Test(){

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida();
        c2.setVida();
        c3.setVida();
        c4.setVida();

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getVecinosMuertos() == 3;
    }

    
    
}
