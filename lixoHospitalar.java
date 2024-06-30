public class lixoHospitalar {
   
    private String tipoResiduo;
    private double quantidade;
    private boolean reciclavel;

    
    public lixoHospitalar(String tipoResiduo, double quantidade, boolean reciclavel) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.reciclavel = reciclavel;
    }

   
    public String getTipoResiduo() {
        return tipoResiduo;
    }

   
    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    
    public double getQuantidade() {
        return quantidade;
    }

    
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    
    public boolean isReciclavel() {
        return reciclavel;
    }

    
    public void setReciclavel(boolean reciclavel) {
        this.reciclavel = reciclavel;
    }

    
    public static void main(String[] args) {
        

        
        lixoHospitalar residuo1 = new lixoHospitalar("Agulhas", 5.2, false);

        
        System.out.println("Tipo de resíduo: " + residuo1.getTipoResiduo());
        System.out.println("Quantidade: " + residuo1.getQuantidade() + " kg");
        System.out.println("Reciclável? " + (residuo1.isReciclavel() ? "Sim" : "Não"));

       
        residuo1.setQuantidade(7.8);
        residuo1.setReciclavel(true);
        System.out.println("Nova quantidade: " + residuo1.getQuantidade() + " kg");
        System.out.println("Agora é reciclável? " + (residuo1.isReciclavel() ? "Sim" : "Não"));

        
        System.out.println(residuo1.toString());
    }

    
    @Override
    public String toString() {
        return "LixoHospitalar{" +
                "tipoResiduo='" + tipoResiduo + '\'' +
                ", quantidade=" + quantidade +
                " kg, reciclavel=" + (reciclavel ? "Sim" : "Não") +
                '}';
    }
}
