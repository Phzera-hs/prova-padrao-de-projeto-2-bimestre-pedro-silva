package questao3;

public abstract class abstBebida {
    protected String descricao = "Bebida Desconhecida";

    public String getDescricao() {
        return this.descricao;
    }

    public abstract double getPreco();
}
