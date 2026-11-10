package questao3;

public class Leite extends abstComplemento {
    
    public Leite(abstBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return this.bebida.getPreco() + 1.50;
    }
}
