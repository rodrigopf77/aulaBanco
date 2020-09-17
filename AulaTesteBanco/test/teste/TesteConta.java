package teste;

import org.junit.Assert;
import org.junit.Test;
import programa.Cliente;
import programa.ContaPrime;

public class TesteConta {
    
    @Test
    public void testaLimite(){
        
        //Cenário
        Cliente cliente = new Cliente();
        cliente.setNome("Calebe");
        cliente.setRenda(1000);
        
        ContaPrime cPrime = new ContaPrime(123, 321);
        cPrime.addCliente(cliente);
        
        //Ação
        cPrime.calcularLimite(cliente);
        
        //Valida
        Assert.assertEquals(cPrime.getLimite(), 200, 0.1);
        
    }
    
}
