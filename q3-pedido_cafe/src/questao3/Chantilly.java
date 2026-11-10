package questao3;

public class Chantilly extends abstComplemento {

    public Chantilly(abstBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + ", Chantilly";
    }

    @Override
    public double getPreco() {
        return this.bebida.getPreco() + 2.50;
    }
}
