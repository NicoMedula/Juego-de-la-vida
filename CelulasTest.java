

import org.junit.Test;

import java.util.Random;

/**
 
 Todas las células se actualizan simultáneamente en cada turno, siguiendo estas reglas:

Nace: Si una célula muerta tiene exactamente 3 células vecinas vivas "nace" (es decir, al turno siguiente estará viva).

Muere: una célula viva puede morir por uno de 2 casos:

	1)Sobrepoblación: si tiene más de tres vecinos vivos alrededor.
	2)Aislamiento: si tiene solo un vecino alrededor o ninguno.

Vive: una célula se mantiene viva si tiene 2 o 3 vecinos vivos a su alrededor.

 */


public class CelulasTest {
    
    @Test
    public void estado_de_una_celula_Test(){
        Random random = new Random();
        int vidaRand = random.nextInt(2);


        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        assert c1.getVida() == 1 || c1.getVida()==0;
        assert c2.getVida() == 1 || c2.getVida()==0;
        assert c3.getVida() == 1 || c3.getVida()==0;
        assert c4.getVida() == 1 || c4.getVida()==0;
        

    }

    @Test
    public void vecino_vivo_Test(){

        Random random = new Random();
        int vidaRand = random.nextInt(2);

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getVecinosVivos() == 1 || t1.getVecinosVivos() == 2 || t1.getVecinosVivos() == 3 || t1.getVecinosVivos() == 4 ||
                                    t1.getVecinosVivos() == 0;
        
        


    }

    @Test
    public void vecino_muerto_Test(){

        Random random = new Random();
        int vidaRand = random.nextInt(2);

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getVecinosMuertos() == 2 || t1.getVecinosMuertos()==1 || t1.getVecinosMuertos()==3 ||
                         t1.getVecinosMuertos()==4 || t1.getVecinosMuertos()==0;

    }


    @Test
    public void celula_nace_Test(){

        Random random = new Random();
        int vidaRand = random.nextInt(2);

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getNaceCelula() == "Nacio la celula " || t1.getNaceCelula()== "No nacio ninguna celula";

    }

    @Test
    public void celula_muere_por_aislamiento_Test(){
        Random random = new Random();
        int vidaRand = random.nextInt(2);

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);

        assert t1.getMuereCelulaAislamiento() == "Murio la celula" || t1.getMuereCelulaAislamiento() == "No murio ninguna celula";
    }

    public void celula_se_mantiene_viva_Test(){
        Random random = new Random();
        int vidaRand = random.nextInt(2);

        Tablero t1 = new Tablero();

        Celulas c1= new Celulas();
        Celulas c2= new Celulas();
        Celulas c3= new Celulas();
        Celulas c4= new Celulas();


        c1.setVida(vidaRand);
        c2.setVida(vidaRand);
        c3.setVida(vidaRand);
        c4.setVida(vidaRand);

        t1.addCelulas(c1);
        t1.addCelulas(c2);
        t1.addCelulas(c3);
        t1.addCelulas(c4);


        assert t1.getSeMantienenVivaCelula() == "La celula que se mantiene viva es" || t1.getSeMantienenVivaCelula() == "Murio una celula ";
    }
    
}
