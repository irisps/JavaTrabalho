public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int dataNascimento, double cpf, char sexo, String cargo, double salario) {
        super(nome, dataNascimento, cpf, sexo);
        this.cargo = cargo;
        this.salario = salario;
    }
    
        public String getCargo() {
            return cargo;
        }
    
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    
        public double getSalario() {
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Cargo: " + cargo + ", Salário: " + salario;
        }
    }   