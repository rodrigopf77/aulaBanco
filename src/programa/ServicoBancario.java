package programa;

public interface ServicoBancario {
    
    public void deposito(double valor);
    public void saque(double valor);
    public void transferir(Conta destino, double valor);
    
}
