public class Compras implements IObserver {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("Compras: Alerta! Estoque baixo do produto " + nomeProduto + " (Quantidade: " + novaQuantidade + ")");
        }
    }
}
