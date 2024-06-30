public class laboratorio {
    private String nome; 
    private String tipoPesquisa; 
    private boolean emFuncionamento; 
    
    public laboratorio(String nome, String tipoPesquisa, boolean emFuncionamento) {
        this.nome = nome;
        this.tipoPesquisa = tipoPesquisa;
        this.emFuncionamento = emFuncionamento;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
    public String getTipoPesquisa() {
        return tipoPesquisa;
    }
    
    
    public void setTipoPesquisa(String tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }
    
    
    public boolean isEmFuncionamento() {
        return emFuncionamento;
    }
    
    
    public void setEmFuncionamento(boolean emFuncionamento) {
        this.emFuncionamento = emFuncionamento;
    }
    
    
    public void     
        System.out.println("Nome do laboratório: " + labMicrobiologia.getNome());
        System.out.println("Tipo de pesquisa: " + labMicrobiologia.getTipoPesquisa());
        System.out.println("Em funcionamento: " + (labMicrobiologia.isEmFuncionamento() ? "Sim" : "Não"));
        
        
        labMicrobiologia.setTipoPesquisa("Biologia Molecular");
        labMicrobiologia.setEmFuncionamento(false);
        
        
        System.out.println("\nInformações atualizadas:");
        System.out.println("Nome do laboratório: " + labMicrobiologia.getNome());
        System.out.println("Tipo de pesquisa: " + labMicrobiologia.getTipoPesquisa());
        System.out.println("Em funcionamento: " + (labMicrobiologia.isEmFuncionamento() ? "Sim" : "Não"));

}

