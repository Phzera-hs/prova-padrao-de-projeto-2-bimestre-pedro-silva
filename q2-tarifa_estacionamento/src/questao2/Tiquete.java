package questao2;
public class Tiquete {
    private String placa;
    private int tempoPermanencia; 
    private ITarifaStrategy tarifaStrategy; 

    public Tiquete(String placa, int tempoPermanencia, ITarifaStrategy tarifaStrategy) {
        this.placa = placa;
        this.tempoPermanencia = tempoPermanencia;
        this.tarifaStrategy = tarifaStrategy;
    }

    public void setTarifaStrategy(ITarifaStrategy tarifaStrategy) {
        this.tarifaStrategy = tarifaStrategy;
    }

    public void setTempoPermanencia(int tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    public double calcularTotal() {
        return this.tarifaStrategy.calcular(this.tempoPermanencia);
    }

    public void imprimirResumo() {
        double valorTotal = calcularTotal();
        System.out.printf("Placa: %s | Tempo: %d min | Total a pagar: R$ %.2f%n", placa, tempoPermanencia, valorTotal);
    }
}
