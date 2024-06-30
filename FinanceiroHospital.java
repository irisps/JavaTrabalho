import java.util.ArrayList;
import java.util.List;

public class FinanceiroHospital {
    private List<ContaReceber> contasReceber;
    private List<ContaPagar> contasPagar;

    public FinanceiroHospital() {
        this.contasReceber = new ArrayList<>();
        this.contasPagar = new ArrayList<>();
    }

    public void adicionarContaReceber(ContaReceber conta) {
        contasReceber.add(conta);
    }

    public void removerContaReceber(ContaReceber conta) {
        contasReceber.remove(conta);
    }

    public void adicionarContaPagar(ContaPagar conta) {
        contasPagar.add(conta);
    }

    public void removerContaPagar(ContaPagar conta) {
        contasPagar.remove(conta);
    }

    public double calcularTotalReceitas() {
        double totalReceitas = 0;
        for (ContaReceber conta : contasReceber) {
            totalReceitas += conta.getValor();
        }
        return totalReceitas;
    }

    public double calcularTotalDespesas() {
        double totalDespesas = 0;
        for (ContaPagar conta : contasPagar) {
            totalDespesas += conta.getValor();
        }
        return totalDespesas;
    }

    public double calcularSaldoAtual() {
        return calcularTotalReceitas() - calcularTotalDespesas();
    }

    public void imprimirDemonstrativoFinanceiro() {
        System.out.println("Financeiro");
        System.out.println("Total de Receitas: R$" + calcularTotalReceitas());
        System.out.println("Total de Despesas: R$" + calcularTotalDespesas());
        System.out.println("Saldo Atual: R$" + calcularSaldoAtual());
    }
}

