public class Pilha {

    private int tamanhoMaximo;
    private int topo;
    private char[] elementos;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1;
        this.elementos = new char[tamanhoMaximo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public void empilhar(char elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Pilha cheia");
        }
        topo++;
        elementos[topo] = elemento;
    }

    public char desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        char elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public char topo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }
}

