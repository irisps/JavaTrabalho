public class lanchonete {
    
    private String lanche;

    
    public lanchonete(String lanche) {
        this.lanche = lanche;
    }

   
    public String getLanche() {
        return lanche;
    }

   
    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

   
    public static void main(String[] args) {
        

       
        lanchonete lanchonete = new lanchonete("X-Burger");

        
        System.out.println("Lanche oferecido: " + lanchonete.getLanche());

        
        lanchonete.setLanche("Cachorro-quente");
        System.out.println("Novo lanche oferecido: " + lanchonete.getLanche());
    }

    
    @Override
    public String toString() {
        return "Lanchonete{" +
                "lanche='" + lanche + '\'' +
                '}';
    }
}
