import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Primeira situação
        System.out.println("Classificação por Teor de Cacau");
        System.out.println("Teor de cacau: ");
        double teorCacau = teclado.nextDouble();

        if (teorCacau < 25) {
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'");
        } else if (teorCacau >= 25 || teorCacau <= 35) {
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        } else { // Para caso esteja acima de 35
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }

        // Segunda situação
        System.out.println("Verificação de Categoria e Rótulo");
        System.out.println("Tipo de chocolate: ");
        String tipoChoco = teclado.nextLine().toUpperCase();
        System.out.println("Quantidade de açúcar: ");
        int qtA = teclado.nextInt();

        if (tipoChoco == "AO_LEITE" && qtA > 15) {
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        } else {
            System.out.println("Classificação: Chocolate balanceado");
        }

        // Terceira situação
        System.out.println("Precificação de Exportação");
        System.out.println("Preço do ovo de Páscoa: ");
        double priceOvo = teclado.nextDouble();
        System.out.println("Nota de pureza (de 0 a 10): ");
        int notaP = teclado.nextInt();

        if (priceOvo > 100 || notaP < 5) {
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        } else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }

        teclado.close();
    }
}
