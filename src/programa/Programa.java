package programa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Cliente cliente = new Cliente();
        cliente.criarPessoa();
        cliente.mostrarPessoa();
        

    }
    
}
