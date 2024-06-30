public class ambulatorio {
   
    private String nomePaciente;
    private char tipoExameEletivo;
    private char resultado;
    private char diagnostico;

    
    public ambulatorio(String nomePaciente, char tipoExameEletivo, char resultado, char diagnostico) {
        this.nomePaciente = nomePaciente;
        this.tipoExameEletivo = tipoExameEletivo;
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

    
    public String getNomePaciente() {
        return nomePaciente;
    }

    
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    
    public char getTipoExameEletivo() {
        return tipoExameEletivo;
    }

    
    public void setTipoExameEletivo(char tipoExameEletivo) {
        this.tipoExameEletivo = tipoExameEletivo;
    }

    
    public char getResultado() {
        return resultado;
    }

    
    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

   
    public char getDiagnostico() {
        return diagnostico;
    }

    
    public void setDiagnostico(char diagnostico) {
        this.diagnostico = diagnostico;
    }

    
    @Override
    public String toString() {
        return "Paciente: " + nomePaciente +
               ", Tipo de Exame Eletivo: " + tipoExameEletivo +
               ", Resultado: " + resultado +
               ", Diagnóstico: " + diagnostico;
    }

    
    public static void main(String[] args) {
       
        ambulatorio ambulatorio = new ambulatorio("João Silva", 'A', 'P', 'C');

        
        System.out.println("Nome do paciente: " + ambulatorio.getNomePaciente());
        System.out.println("Tipo de Exame Eletivo: " + ambulatorio.getTipoExameEletivo());
        System.out.println("Resultado do exame: " + ambulatorio.getResultado());
        System.out.println("Diagnóstico: " + ambulatorio.getDiagnostico());

        
        ambulatorio.setResultado('N');
        System.out.println("Novo resultado do exame: " + ambulatorio.getResultado());

       
        System.out.println(ambulatorio.toString());
    }
}
