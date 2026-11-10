package questao2;
public class TarifaRotativo implements ITarifaStrategy {
    private static final double VALOR_HORA = 10.0; 

    @Override
    public double calcular(int tempoPermanencia) {
        int horasIniciadas = (int) Math.ceil(tempoPermanencia / 60.0);
        return horasIniciadas * VALOR_HORA;
    }
}
