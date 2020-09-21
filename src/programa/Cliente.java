package programa;

public class Cliente extends Pessoa{
    private double renda;
    
    @Override
    public void criarPessoa(){
        super.criarPessoa();
        
        System.out.println("Renda: ");
        this.renda = sc.nextDouble();
        
    }
    
    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("Renda: " + this.renda);
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
}
