public class PacienteEletivo extends Pessoa {
    public String plano;
    public char diagnostico;

    public PacienteEletivo(String nome, int dataNascimento, double cpf, String plano, String diagnostico2, char acompanhante, char diagnostico) {
        super(nome, dataNascimento, cpf, diagnostico, acompanhante);
        this.plano = plano;
        this.diagnostico = diagnostico;
    }


    public char getDiagnostico() {
        return diagnostico;
    }

    public String getPlano() {
        return plano;
    }

    public PacienteEletivo buscarPacienteEletivoPorNome(String nomePaciente) {
        PacienteEletivo paciente = buscarPacienteEletivoPorNome(nomePaciente);
            return paciente;
    }

}
