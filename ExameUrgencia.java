public class ExameUrgencia {
    private String nomePaciente;
    private String tipoExameUrgencia;
    private String resultado;
    private String diagnostico;

    public ExameUrgencia(String nomePaciente, String tipoExameUrgencia, String resultado, String diagnostico) {
        this.nomePaciente = nomePaciente;
        this.tipoExameUrgencia = tipoExameUrgencia;
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoExameUrgencia() {
        return tipoExameUrgencia;
    }

    public void setTipoExameUrgencia(String tipoExameUrgencia) {
        this.tipoExameUrgencia = tipoExameUrgencia;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Paciente: " + nomePaciente +
               ", Tipo de Exame: " + tipoExameUrgencia +
               ", Resultado: " + resultado +
               ", Diagnóstico: " + diagnostico;
    }
}

