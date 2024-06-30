public class ConsultaUrgencia implements ConsultorioUrgencia {
    public char gravidade;
    public int data;
    public double horario;
    public char retorno;

    public ConsultaUrgencia(char gravidade, int data, double horario, char retorno) {
        this.gravidade = gravidade;
        this.data = data;
        this.horario = horario;
        this.retorno = retorno;
    }

    public char getGravidade() {
        return gravidade;
    }

    public void setGravidade(char gravidade) {
        this.gravidade = gravidade;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public char getRetorno() {
        return retorno;
    }

    public void setRetorno(char retorno) {
        this.retorno = retorno;
    }

    @Override
    public void realizarConsulta(PacienteUrgencia paciente) {
        System.out.println("Realizando consulta de urgência para: " + paciente);
    }
}
