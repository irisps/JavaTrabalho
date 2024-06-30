import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<PacienteUrgencia> listaPacientesUrgencia = new ArrayList<>();
    private static ArrayList<PacienteEletivo> listaPacientesEletivos = new ArrayList<>();
    private static ArrayList<ContaReceber> contasAReceber = new ArrayList<>();
    private static ArrayList<ContaPagar> contasAPagar = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarNovoPacienteUrgencia();
                    break;
                case 2:
                    cadastrarNovoPacienteEletivo();
                    break;
                case 3:
                    realizarConsultaUrgencia();
                    break;
                case 4:
                    realizarConsultaEletiva();
                    break;
                case 5:
                    realizarExameUrgencia();
                    break;
                case 6:
                    realizarExameEletivo();
                    break;
                case 7:
                    adicionarContaReceber();
                    break;
                case 8:
                    adicionarContaPagar();
                    break;
                case 9:
                    exibirDemonstrativoFinanceiro();
                    break;
                case 10:
                    cadastrarNovoFuncionario();
                    break;
                case 11:
                    cadastrarFarmacia();
                    break;
                case 12:
               
                    break;
                case 13:
                   cadastrarAmbulatorio();
                   break;
                case 14:
                   cadastrarlanchonete();
                   break;   
                case 0:
                    System.out.println("Programa encerra.");
                    break;
                default:
                    System.out.println("Escolha outra opção!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }



    private static void exibirMenu() {
        System.out.println("Bem-vindo ao Hospital Positivo! Selecione sua opção:");
        System.out.println("[1] Cadastrar novo paciente de urgência");
        System.out.println("[2] Cadastrar novo paciente eletivo");
        System.out.println("[3] Realizar consulta de urgência");
        System.out.println("[4] Realizar consulta eletiva");
        System.out.println("[5] Realizar exame de urgência");
        System.out.println("[6] Realizar exame eletivo");
        System.out.println("[7] Adicionar conta a receber");
        System.out.println("[8] Adicionar conta a pagar");
        System.out.println("[9] Exibir demonstrativo financeiro");
        System.out.println("[10] Cadastrar novo funcionário");
        System.out.println("[11] Farmácia");
        System.out.println("[12] Laborátorio");
        System.out.println("[13] Ambulatório");
        System.out.println("[14] lanchonete");
        System.out.println("[15] lixoHospitalar");
        System.out.println("[16] teleatendimento");
        System.out.println("[0] Encerrar o programa");
    }

    private static void cadastrarNovoPacienteUrgencia() {
        System.out.println("\nCadastro de novo paciente de urgência");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        int dataNascimento = scanner.nextInt();
        System.out.print("CPF: ");
        double cpf = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Plano de saúde: ");
        String planoSaude = scanner.nextLine();
        System.out.print("Sintomas: ");
        String sintomas = scanner.nextLine();
        System.out.print("Histórico médico: ");
        String historicoMedico = scanner.nextLine();
        System.out.print("Sexo: ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.print("Diagnóstico: ");
        String diagnostico = scanner.nextLine();

        PacienteUrgencia paciente = new PacienteUrgencia(nome, dataNascimento, cpf, planoSaude, sintomas, historicoMedico, sexo, diagnostico);
        listaPacientesUrgencia.add(paciente);
        System.out.println("Paciente de urgência cadastrado com sucesso!");
    }

    private static void cadastrarNovoPacienteEletivo() {
        System.out.println("\nCadastro de novo paciente eletivo");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        int dataNascimento = scanner.nextInt();
        System.out.print("CPF: ");
        double cpf = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Plano de saúde: ");
        String plano = scanner.nextLine();
        System.out.print("Diagnóstico: ");
        String diagnostico = scanner.nextLine();
        System.out.print("Sexo: ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.print("Acompanhante: ");
        char acompanhante = scanner.nextLine().charAt(0);

        PacienteEletivo paciente = new PacienteEletivo(nome, dataNascimento, cpf, plano, diagnostico, sexo, acompanhante);
        listaPacientesEletivos.add(paciente);
        System.out.println("Paciente eletivo cadastrado com sucesso!");
    }

    private static void realizarConsultaUrgencia() {
        System.out.println("\nRealizar consulta de urgência");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        PacienteUrgencia paciente = buscarPacienteUrgenciaPorNome(nomePaciente);
        if (paciente != null) {
            ConsultaUrgencia consulta = new ConsultaUrgencia('A', 20240627, 14.30, 'S');
            consulta.realizarConsulta(paciente);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static PacienteUrgencia buscarPacienteUrgenciaPorNome(String nomePaciente) {
        return null; 
    }

    private static void realizarConsultaEletiva() {
        System.out.println("\nRealizar consulta eletiva");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        PacienteEletivo paciente = buscarPacienteEletivoPorNome(nomePaciente);
        if (paciente != null) {
            ConsultaEletiva consulta = new ConsultaEletiva('A', 20240627, 10.00, 'S');
            consulta.realizarConsulta(paciente);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static PacienteEletivo buscarPacienteEletivoPorNome(String nomePaciente) {
        return null;
    }

    private static void realizarExameUrgencia() {
        System.out.println("\nRealizar exame de Urgência");
        System.out.print("Nome do Paciente: ");
        String nomePaciente = scanner.nextLine();

        PacienteUrgencia paciente = buscarPacienteUrgenciaPorNome(nomePaciente);
        if (paciente != null) {
            ExameUrgencia exame = new ExameUrgencia(nomePaciente, "Hemograma", "Normal", "Sem diagnóstico");
            System.out.println("Exame realizado:\n" + exame);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void realizarExameEletivo() {
        System.out.println("\nRealizar exame eletivo");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        PacienteEletivo paciente = buscarPacienteEletivoPorNome(nomePaciente);
        if (paciente != null) {
            ExameEletivo exame = new ExameEletivo(nomePaciente, 'R', 'R', 'R');
            System.out.println("Exame realizado:\n" + exame);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void adicionarContaReceber() {
        System.out.println("\nAdicionar conta a receber");
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        ContaReceber conta = new ContaReceber(valor, descricao);
        contasAReceber.add(conta);
        System.out.println("Conta a receber adicionada com sucesso!");
    }

    private static void adicionarContaPagar() {
        System.out.println("\nAdicionar conta a pagar");
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        ContaPagar conta = new ContaPagar(valor, descricao);
        contasAPagar.add(conta);
        System.out.println("Conta a pagar adicionada com sucesso!");
    }

    private static void exibirDemonstrativoFinanceiro() {
        System.out.println("\nDemonstrativo financeiro");
    }

    private static void cadastrarFarmacia() {
        System.out.println("\nMedicamentos disponiveis:");
        scanner.nextLine();
    }

    private static void cadastrarNovoFuncionario() {
        System.out.println("\nCadastro de novo funcionário");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        int dataNascimento = scanner.nextInt();
        System.out.print("CPF: ");
        double cpf = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Sexo: ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, dataNascimento, cpf, sexo, cargo, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }


    private static void cadastrarAmbulatorio() {
        System.out.println("\nexibindo ambulatorio");
        System.out.print("Nome paciente: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("tipo de exame : ");
        char tipoExameEletivo = scanner.nextLine().charAt(0);
        System.out.print("resultado : ");
        char resultado = scanner.nextLine().charAt(0);
        System.out.print("diagnostico : ");
        char diagnostico = scanner.nextLine().charAt(0);

        @SuppressWarnings("unused")
        ambulatorio ambulatorio = new ambulatorio(nomePaciente, tipoExameEletivo, resultado, diagnostico);
        System.out.println("exibindo dados ");
}
private static void cadastrarlanchonete() {
    System.out.println("\nbem vindos a lanchonete");
    System.out.print("lanche: ");
    String lanche = scanner.nextLine();

    @SuppressWarnings("unused")
    lanchonete lanchonete = new lanchonete(lanche);
    System.out.println("exibindo dados ");
}

@SuppressWarnings("unused")
private static void cadastrarlixoHospitalar() {
    System.out.println("\ndescarte de lixo");
    System.out.print("tipo de resido ");
    @SuppressWarnings("unused")
    String tipoResiduo = scanner.nextLine();
    System.out.println("\nquantidade");
    @SuppressWarnings("unused")
    double quantidade = scanner.nextInt();

}
@SuppressWarnings("unused")
private static void cadastrarteleatendimento() {
    System.out.println("\nteleatendimento");
    System.out.print("motivo: ");
    String motivoLigacao = scanner.nextLine();
    System.out.println("paciente");
    String pacientesEmAtendimento = scanner.nextLine();



    @SuppressWarnings("unused")
    teleatendimento teleatendimento = new teleatendimento(motivoLigacao,pacientesEmAtendimento);
    System.out.println("exibindo dados ");
}

}