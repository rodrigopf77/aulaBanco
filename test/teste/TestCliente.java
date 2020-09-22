package teste;

import org.junit.Assert;
import org.junit.Test;
import programa.Cliente;

public class TestCliente {
    
    @Test
    public void testaCadastroCliente(){
        //Cenário
        Cliente cliente = new Cliente("Rodrigo");
        
        //Ação
        
        cliente.setEmail("fulano@");
        cliente.setRenda(5000);
        
        //Validação
//        Assert.assertNotNull("Campo vazio: ", cliente.getNome());
        Assert.assertEquals("", cliente.getNome().trim());
        
    }
    
}
