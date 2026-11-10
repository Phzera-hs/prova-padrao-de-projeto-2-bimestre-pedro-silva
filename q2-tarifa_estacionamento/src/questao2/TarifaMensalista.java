package questao2;
public class TarifaMensalista implements ITarifaStrategy {
    private static final double VALOR_FIXO = 150.0; 

    @Override
    public double calcular(int tempoPermanencia) {
        return VALOR_FIXO;
    }
}
