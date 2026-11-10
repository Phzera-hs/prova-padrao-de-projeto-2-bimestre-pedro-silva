package questao2;
public class Main {
    public static void main(String[] args) {
        int tempo = 150;

        System.out.println("--- Resumo de Cálculo para o mesmo tempo (150 min) ---");        
        ITarifaStrategy rotativo = new TarifaRotativo();
        Tiquete tiquete1 = new Tiquete("ABC-1234", tempo, rotativo);
        System.out.print("Rotativo: ");
        tiquete1.imprimirResumo();

        ITarifaStrategy mensalista = new TarifaMensalista();
        Tiquete tiquete2 = new Tiquete("DEF-5678", tempo, mensalista);
        System.out.print("Mensalista: ");
        tiquete2.imprimirResumo();

        ITarifaStrategy conveniado = new TarifaConveniado();
        Tiquete tiquete3 = new Tiquete("GHI-9012", tempo, conveniado);
        System.out.print("Conveniado: ");
        tiquete3.imprimirResumo();

        System.out.println("\n--- Troca de perfil no mesmo tíquete (Tempo de Execução) ---"); 
        
        Tiquete tiqueteDinamico = new Tiquete("XYZ-9999", tempo, rotativo);
        System.out.print("Tíquete Inicial (Rotativo): ");
        tiqueteDinamico.imprimirResumo();

        tiqueteDinamico.setTarifaStrategy(conveniado);
        System.out.print("Tíquete Alterado (Conveniado): ");
        tiqueteDinamico.imprimirResumo();
        
        tiqueteDinamico.setTarifaStrategy(mensalista);
        System.out.print("Tíquete Alterado (Mensalista): ");
        tiqueteDinamico.imprimirResumo();
    }
}
