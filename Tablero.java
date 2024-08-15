import java.util.ArrayList;
import java.util.Random;

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

public class Tablero {
    
    private ArrayList<Celulas> listaCelulas = new ArrayList<>();

    private Random random = new Random();
    

        public void addCelulas(Celulas celula){
            celula.setVida(random.nextInt(2));
            listaCelulas.add(celula);
        }
        
        public ArrayList<Celulas> getListaCelulas(){
            return listaCelulas;
        }

        public int getTamañoArray(){
            return listaCelulas.size();
        }

        public int getVecinosVivos(){

            int vecinosVivos=0;
           
            for (int i=0; i<listaCelulas.size(); i++){ 

                if ( getListaCelulas().get(i).getVida() == 1) {
                    vecinosVivos += 1;
                   
                }
    
            }
    
            return vecinosVivos;
        }

        public int getVecinosMuertos(){

            int vecinosMuertos=0;

            for (int i=0; i<listaCelulas.size(); i++){ 

                if ( getListaCelulas().get(i).getVida() == 0) {
                    vecinosMuertos += 1;
                   
                }
    
            }
            return vecinosMuertos;
        }


        public String getNaceCelula(){

            int i;
            boolean celulaNacio=false;
            Celulas celulaQueNacio=null;

            for (i=0; i<listaCelulas.size(); i++){

                if (getListaCelulas().get(i).getVida() == 0 && getVecinosVivos()==3) {

                    getListaCelulas().get(i).setVida(1);

                    celulaQueNacio = getListaCelulas().get(i);
                    celulaNacio = true;
                }
            }

            if (celulaNacio) {
                return "Nacio la celula"+listaCelulas.indexOf(celulaQueNacio); 
                
            }else{
                
                return "No nacio ninguna celula";
            }
            
        }


        public void getMuereCelulaSobrepoblacion(){

        }

        public String getMuereCelulaAislamiento(){


            //Muere: una célula viva puede morir por uno de 2 casos:
	            
            //1)Sobrepoblación: si tiene más de tres vecinos alrededor.
	            
            //2)Aislamiento: si tiene solo un vecino alrededor o ninguno.

            int i;
            boolean celulaMurio=false;
            Celulas celulaQueMurio=null;

            for (i=0; i<listaCelulas.size(); i++){

                if (getListaCelulas().get(i).getVida() == 1 && (getVecinosVivos()-1)<=1) {

                    getListaCelulas().get(i).setVida(0);

                    celulaQueMurio = getListaCelulas().get(i);
                    celulaMurio = true;
                }
            }

            if (celulaMurio) {
                return "Murio la celula "+listaCelulas.indexOf(celulaQueMurio); 
                
            }else{
                
                return "No murio ninguna celula";
            }

        }

        public String getSeMantienenVivaCelula(){

            //Vive: una célula se mantiene viva si tiene 2 o 3 vecinos a su alrededor.

            int i;
            boolean celulaVive=false;
            Celulas celulaQueVive=null;

            for (i=0; i<listaCelulas.size(); i++){

                if (getListaCelulas().get(i).getVida() == 1 && (getVecinosVivos()-1)>1 ) {

                    getListaCelulas().get(i).setVida(1);

                    celulaQueVive = getListaCelulas().get(i);
                    celulaVive = true;
                }else{
                    getListaCelulas().get(i).setVida(0);
                }
            }

            if (celulaVive) {
                return "La celula que se mantiene viva es "+listaCelulas.indexOf(celulaQueVive); 
                
            }else{
                
                return "Murio una celula " ;
            }


        }

        




}
