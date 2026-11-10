package questao3;

public class Calda extends abstComplemento {

    public Calda(abstBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Calda";
    }

    @Override
    public double getPreco() {
        return this.bebida.getPreco() + 2.00;
    }
}
