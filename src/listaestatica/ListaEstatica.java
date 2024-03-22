package listaestatica;

public class ListaEstatica {

    private double[] vetor;
    private int n;

    public ListaEstatica() { //construtor
        this.vetor = new double[1000]; //expecificar que o atributo é dessa classe 
        this.n = 0;
    }

    public void insereNo(double valor) { //polimorfismo
        this.vetor[n] = valor;
        this.n++;
    }

    public void insereNo(double valor, int pos) {//método para o usuário definir a posição do vetor
        for (int i = this.n; i > pos; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }
        this.vetor[pos] = valor;
        this.n++;
    }
    public boolean insere(double valor, int pos){//valida a posição e insere o insereNo
        if(!validaPos(pos)){//inverte oq é verdadeiro fica falso e vice-versa
            return false;
        }
        insereNo(valor,pos);
        return true;
    }

    public boolean validaPos(int pos) { //necessário quando há a opção de definir a posição do vetor
        if ((pos < 0) || (pos > n)) {
            return false;
        } else {
            return true;
        }
    }

    public void imprime() {
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println(" ");
    }
    
    public boolean deletar(int pos) {
        if(!validaPos(pos)){
            return false;
        }
        else{
            for(int i = pos; i < this.n-1; i++){//i é o contador e vai percorrer o vetor/for
             vetor[i] = vetor [i + 1];
            }
        }
        n--;
        return true;
    }
}