package questao3;

public class Cha extends abstBebida {
    public Cha() {
        this.descricao = "Chá";
    }

    @Override
    public double getPreco() {
        return 4.00;
    }
}
