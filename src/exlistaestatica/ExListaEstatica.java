package exlistaestatica;
import listaestatica.*; //importar a ListaEstatica

public class ExListaEstatica {

    public static void main(String[] args) {
        ListaEstatica le = new ListaEstatica();
        
        le.insere(36, 0);
        le.insere(99,1);
        le.insere(100,2);
        le.insere(57,-3);
        le.deletar(2);
        le.imprime();
        
    }
    
}
