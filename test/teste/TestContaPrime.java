package teste;

import org.junit.Assert;
import org.junit.Test;
import br.com.premiumtechnology.model.Cliente;
import br.com.premiumtechnology.model.ContaPrime;

public class TestContaPrime {
    
    @Test
    public void testaLimiteRenda(){
        
        //Cenário
        Cliente cliente = new Cliente("Rodrigo");
        ContaPrime cPrime = new ContaPrime(123, 321, cliente);
        
        cliente.setNome("Valentina");
        cliente.setRenda(5000);
        
        cPrime.addCliente(cliente);
        
        //Ação
        cPrime.calcularLimite(cliente);
        
        //Validação
        Assert.assertEquals(998.9999999999, cPrime.getLimite(), 1);
        
    }
    
    @Test
    public void verificaTitular(){
        //Cenario
        Cliente titular = new Cliente("Carolina");
        
        //Ação
        ContaPrime cPrime = new ContaPrime(123,0321, titular);
        
        //Validação
        Assert.assertNotNull(cPrime.getTitular());
        
    }
}
