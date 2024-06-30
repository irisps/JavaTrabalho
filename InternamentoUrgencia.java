public class InternamentoUrgencia {
    private PacienteUrgencia paciente;
    private String dataEntrada;
    private String dataSaida;
    private String nomeCirurgia;
    private String medicoResponsavel;
    private String horarioCirurgia;
    private String previsaoAlta;

    public InternamentoUrgencia(PacienteUrgencia paciente, String dataEntrada, String nomeCirurgia, String medicoResponsavel, String horarioCirurgia) {
        this.paciente = paciente;
        this.dataEntrada = dataEntrada;
        this.nomeCirurgia = nomeCirurgia;
        this.medicoResponsavel = medicoResponsavel;
        this.horarioCirurgia = horarioCirurgia;
    }

    public void registrarSaida(String dataSaida, String previsaoAlta) {
        this.dataSaida = dataSaida;
        this.previsaoAlta = previsaoAlta;
    }

    public PacienteUrgencia getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteUrgencia paciente) {
        this.paciente = paciente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getNomeCirurgia() {
        return nomeCirurgia;
    }

    public void setNomeCirurgia(String nomeCirurgia) {
        this.nomeCirurgia = nomeCirurgia;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getHorarioCirurgia() {
        return horarioCirurgia;
    }

    public void setHorarioCirurgia(String horarioCirurgia) {
        this.horarioCirurgia = horarioCirurgia;
    }

    public String getPrevisaoAlta() {
        return previsaoAlta;
    }

    public void setPrevisaoAlta(String previsaoAlta) {
        this.previsaoAlta = previsaoAlta;
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente.getNome() + 
               ", Data de Entrada: " + dataEntrada + 
               ", Nome da Cirurgia: " + nomeCirurgia + 
               ", Médico Responsável: " + medicoResponsavel + 
               ", Horário da Cirurgia: " + horarioCirurgia + 
               ", Data de Saída: " + dataSaida + 
               ", Previsão de Alta: " + previsaoAlta;
    }
}
