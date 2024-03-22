package pacote;

import listaestatica.ListaEstatica;

public class ExListaEstatica {

    public static void main(String[] args) {
        ListaEstatica le = new ListaEstatica();
        
        le.insere(36, 0);
        le.insere(99,1);
        le.insere(100,2);
        le.insere(57,-3);
        le.deletar(2);
        le.imprime();
        
        System.out.println(le.le(2));
        System.out.println(le.busca(36));
        
    }
    
}
