public class ConsultaEletiva implements Consultorio{
    public char agendar;
    public int data;
    public double horario;
    public char retorno;

    public ConsultaEletiva(char agendar, int data, double horario, char retorno){
        this.agendar = agendar;
        this.data = data;
        this.horario = horario;
        this.retorno = retorno;
    }

    public char getagendar(){ 
        return agendar;
    }

    public void setagendar(char novoagendamento){
        agendar = novoagendamento;
    }

    public int getdata(){
        return data;
    }

    public void setdata(int novadata){
        data = novadata;
    }

    public double gethorario(){
        return horario;
    }

    public void sethorario(double horario){
        this.horario = horario;
    }

    public char getretorno(){
        return retorno;
    }

    public void setretorno(char novoretorno){
        this.retorno = novoretorno;
    }

    @Override
    public void realizarConsulta(PacienteEletivo pacienteeletivo) {
        System.out.println("realizando consulta de: " + pacienteeletivo);
    }
    


}


