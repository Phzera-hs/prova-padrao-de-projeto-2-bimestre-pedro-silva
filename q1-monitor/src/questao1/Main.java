package questao1;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Monitor de Estoque ---");

        Produto produto = new Produto("Notebook", 10);

        IObserver compras = new Compras();
        IObserver vendas = new Vendas();
        IObserver auditoria = new Auditoria();

        produto.adicionarObserver(compras);
        produto.adicionarObserver(vendas);
        produto.adicionarObserver(auditoria);

        System.out.println("\n[1] Reduzindo estoque para 6 (Apenas Auditoria deve registrar):");
        produto.setQuantidade(6);

        System.out.println("\n[2] Reduzindo estoque para 3 (Alerta de Compras e Auditoria registra):");
        produto.setQuantidade(3);

        System.out.println("\n[3] Reduzindo estoque para 0 (Alerta de Compras, Auditoria registra, Vendas guarda estado):");
        produto.setQuantidade(0);

        System.out.println("\n[4] Tentando alterar para a mesma quantidade 0 (Nenhum evento deve ocorrer):");
        produto.setQuantidade(0);

        System.out.println("\n[5] Repondo estoque para 10 (Alerta de Vendas e Auditoria registra):");
        produto.setQuantidade(10);

        System.out.println("\n[6] Removendo a area de Auditoria e reduzindo para 2 (Apenas Compras alerta):");
        produto.removerObserver(auditoria);
        produto.setQuantidade(2);
    }
}
