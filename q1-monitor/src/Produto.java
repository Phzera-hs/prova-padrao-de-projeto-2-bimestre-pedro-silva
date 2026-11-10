public class Produto extends abstObservable {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade != novaQuantidade) {
            this.quantidade = novaQuantidade;
            notificarObservers(this.nome, this.quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
