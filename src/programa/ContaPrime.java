package programa;

public class ContaPrime extends Conta{
    private double limite;

    public ContaPrime(int agencia, int numeroConta, Cliente titular) {
        super(agencia, numeroConta, titular);
    }
    
    


    
    @Override
    public void mostrarConta(){
        super.mostrarConta();
        
        System.out.println("Limite: " + this.limite);
        
    }
    
    public void calcularLimite(Cliente titular){
        this.limite = titular.getRenda() * 0.2;
    }
    
    @Override
    public void deposito(double valor){
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Valor inválido!");
        }
    }
    
    @Override
    public void saque(double valor){
        if ((this.getSaldo() + this.limite)>= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    @Override
    public void transferir(Conta conta, double valor){
        if ((this.getSaldo() + this.limite)>= valor) {
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
}
