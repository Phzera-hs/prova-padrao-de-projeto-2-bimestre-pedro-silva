package questao3;

public abstract class abstComplemento extends abstBebida {
    protected abstBebida bebida;

    public abstComplemento(abstBebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescricao();
}
