import java.util.HashMap;
import java.util.Map;

public class Vendas implements IObserver {
    private Map<String, Integer> historicoEstoque = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        Integer estoqueAnterior = historicoEstoque.get(nomeProduto);
        
        if (estoqueAnterior != null && estoqueAnterior == 0 && novaQuantidade > 0) {
            System.out.println("Vendas: Produto " + nomeProduto + " voltou a ter estoque! (Nova Quantidade: " + novaQuantidade + ")");
        }
        
        historicoEstoque.put(nomeProduto, novaQuantidade);
    }
}
