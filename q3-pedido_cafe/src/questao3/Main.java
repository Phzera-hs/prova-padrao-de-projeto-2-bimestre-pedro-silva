package questao3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Resumo do Pedido ---");
        
        abstBebida pedido1 = new Espresso();
        System.out.println(pedido1.getDescricao() + " - R$ " + String.format("%.2f", pedido1.getPreco()));

        abstBebida pedido2 = new Cha();
        pedido2 = new Leite(pedido2);
        pedido2 = new Calda(pedido2);
        System.out.println(pedido2.getDescricao() + " - R$ " + String.format("%.2f", pedido2.getPreco()));

        abstBebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Chantilly(pedido3); 
        System.out.println(pedido3.getDescricao() + " - R$ " + String.format("%.2f", pedido3.getPreco()));
    }
}
