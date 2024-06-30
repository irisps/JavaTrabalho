public class ExameEletivo {
    private String nomePaciente; 
    private char tipoExameEletivo;
    private char resultado;
    private char diagnostico;


    public ExameEletivo( String  nomePaciente, char  tipoExameEletivo, char resultado, char  diagnostico){
        this.nomePaciente = nomePaciente;
        this.tipoExameEletivo = tipoExameEletivo;
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

    public String getnomePaciene() {
        return nomePaciente;
    }

    public void setnomePaciente(String novanomePaciente){
        nomePaciente = novanomePaciente;
    }

    public char gettipoExameEletivo(){
        return tipoExameEletivo;
    }

    public void settipoExame(char novatipoExameEletivo){
        tipoExameEletivo = novatipoExameEletivo;
    }

    @Override
    public String toString() {
        return "Paciente: " + nomePaciente +
               ", Tipo de Exame: " + tipoExameEletivo +
               ", Resultado: " + resultado +
               ", Diagnóstico: " + diagnostico;
    }
}