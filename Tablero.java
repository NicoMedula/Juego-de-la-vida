import java.util.ArrayList;

public class Tablero {
    
    private ArrayList<Celulas> listaCelulas = new ArrayList<>();

        public void addCelulas(Celulas celula){
            celula.setVida();
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


}
