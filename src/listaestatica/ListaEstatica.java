package listaestatica;

public class ListaEstatica {

    private double[] vetor;
    private int n;

    public ListaEstatica() { //construtor
        this.vetor = new double[1];
        this.n = 0;
    }

    public ListaEstatica(int tamanho) { //polimorfismo
        this.vetor = new double[tamanho]; //expecificar que o atributo é dessa classe 
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

    public boolean insere(double valor, int pos) {//valida a posição e insere o insereNo
        dobraVetor();
        if (!validaPos(pos)) {//inverte oq é verdadeiro fica falso e vice-versa
            return false;
        }
        insereNo(valor, pos);
        return true;
    }

    public boolean validaPos(int pos) { //necessário quando há a opção de definir a posição do vetor
        if ((pos < 0) || (pos > n)) {
            return false;
        } else {
            return true;
        }
    }

    private void dobraVetor() {
        if (n == vetor.length) {
            double novoVetor[] = new double[vetor.length * 2]; //onde o valores serão movidos para aumentar o vetor
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            System.out.println("o vetor foi duplicado de tamanho");
            vetor = novoVetor;
        }

    }

    public void imprime() {
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println(" ");
    }

    public boolean deletar(int pos) {
        if (!validaPos(pos)) {
            return false;
        } else {
            for (int i = pos; i < this.n - 1; i++) {//i é o contador e vai percorrer o vetor/for
                vetor[i] = vetor[i + 1]; //i ocupa a posição do deletado
            }
        }
        n--;
        return true;
    }

    public Double le(int pos) {
        if (validaPos(pos)) {
            return this.vetor[pos];
        } else {
            return null;
        }
    }

    public Integer busca(double valor) {
        int aux = 0;

        while (aux < this.n) {
            if (this.vetor[aux] == valor) {
                return aux;
            }
            aux++;
        }
        return null;
    }
}
