package questao3;

public class Espresso extends abstBebida {
    public Espresso() {
        this.descricao = "Espresso";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}
