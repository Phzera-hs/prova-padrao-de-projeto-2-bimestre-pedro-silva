public class Auditoria implements IObserver {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("Auditoria: Registro - Produto: " + nomeProduto + " | Nova quantidade em estoque: " + novaQuantidade);
    }
}
