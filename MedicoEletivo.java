public class MedicoEletivo{
    private char sintomas;
    private char exames;
    private char laudo;
    private char retorno;

    public MedicoEletivo(char sintomas, char exames, char laudo, char retorno){
        this.sintomas = sintomas;
        this.exames = exames;
        this.laudo = laudo;
        this.retorno = retorno;
    }
   
    public char getsintomas() {
        return sintomas;
    }

    public void setsintomas(char novosintoma){
        sintomas = novosintoma;
    }

    public char getexames() {
        return exames;
    }

    public void setexames(char novoexames){
        exames = novoexames;
    }

    public char getlaudo() {
        return laudo;
    }

    public void setlaudo(char novolaudo){
        laudo = novolaudo;
    }

    public char getretorno() {
        return retorno;
    }

    public void setretorno(char novoretorno){
        retorno = novoretorno;
    }

}
