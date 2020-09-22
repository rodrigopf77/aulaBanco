package teste;

import org.junit.Assert;
import org.junit.Test;
import programa.Cliente;
import programa.ContaPoupanca;

public class TestContaPoupanca {
    
    @Test
    public void verificaRendimentos(){
        //Cenário
        Cliente titular = new Cliente("Valentina Fernandes");
        ContaPoupanca cPoupanca = new ContaPoupanca(123, 321, titular);
        cPoupanca.deposito(500);
        
        //Ação
        cPoupanca.calculaRendimentos(0.4);
        
        //Validação
        Assert.assertEquals(202, cPoupanca.getSaldo(), 1);
    }
    
    // TESTE DE REGRESSÃO MUDANÇA DE REGRAS DE NEGÓCIO
    @Test
    public void verificaRendimentosRegressao(){
        //Cenário
        Cliente titular = new Cliente("Valentina Fernandes");
        ContaPoupanca cPoupanca = new ContaPoupanca(123, 321, titular);
        cPoupanca.deposito(500);
        
        //Ação
        cPoupanca.calculaRendimentos(0.4);
        
        //Validação
        //Inclusão de desconto do governo
        Assert.assertEquals(560, cPoupanca.getSaldo(), 1);
    }
    
}
