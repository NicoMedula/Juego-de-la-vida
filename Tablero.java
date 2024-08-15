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
}
