package questao2;
public class TarifaConveniado implements ITarifaStrategy {
    private static final double VALOR_HORA = 10.0; 
    private static final double DESCONTO = 0.20; 

    @Override
    public double calcular(int tempoPermanencia) {
        if (tempoPermanencia <= 30) {
            return 0.0;
        }
        
        int tempoCobrado = tempoPermanencia - 30;
        int horasIniciadas = (int) Math.ceil(tempoCobrado / 60.0);
        return horasIniciadas * (VALOR_HORA * (1.0 - DESCONTO));
    }
}
