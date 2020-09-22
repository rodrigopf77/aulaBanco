package programa;

/**
 *
 * @author rodri
 */
public class ContaPoupanca extends Conta{
    
    private double rendimentos;

    public ContaPoupanca(int agencia, int numeroConta, Cliente titular) {
        super(agencia, numeroConta, titular);
    }
    
    @Override
    public void criarConta(Cliente titular){
        super.criarConta(titular);
        
    }
    
    public void calculaRendimentos(double rendimento){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * rendimento));
        this.setSaldo(this.getSaldo() - (this.getSaldo() * 0.2));
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
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    @Override
    public void transferir(Conta conta, double valor){
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
}
