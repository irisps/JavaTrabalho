public class PacienteUrgencia extends Pessoa {
    public  String planoSaude;
    public  String sintomas;
    public  String historicoMedico;
    public  String diagnostico;

    public PacienteUrgencia(String nome, int dataNascimento, double cpf, String planoSaude, String sintomas, String historicoMedico, char sexo, String diagnostico) {
        super(nome, dataNascimento, cpf, sexo);
        this.planoSaude = planoSaude;
        this.sintomas = sintomas;
        this.historicoMedico = historicoMedico;
        this.diagnostico = diagnostico;
    }


    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico (String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
