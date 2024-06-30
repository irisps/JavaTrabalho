import java.util.ArrayList;
import java.util.List;

class farmacia {
    private char  medicamento;
    private int quantidade;
    private List<String> pacientesEmAtendimento;

    public farmacia(char medicamento, int quantidade){
        this.medicamento = medicamento;
        this.quantidade = quantidade;
        this.pacientesEmAtendimento = new ArrayList<>();
    }

    public void setmedicamento(char newMedicamento){
        this.medicamento = newMedicamento;
    }

    public char getmedicamento(){
        return medicamento;
    }

    public void setquantidade(int newquantidade){
        this.quantidade = quantidade;
    }

    public int getquantidade(){
        return quantidade;
    }

    public void atenderPaciente(String paciente) {
        if (paciente != null){
            pacientesEmAtendimento.add(paciente);
            System.out.println("Atendendo paciente na farmácia: " + paciente);
        } else {
            System.out.println("Farmácia vazia!"); 
        }
    
    
    }
}