package programa;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Conta implements ServicoBancario{
    
    private int agencia;
    private int numeroConta;
    private double saldo;
    private Cliente titular;
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public Conta(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void criarConta(Cliente titular){
        System.out.println("Agencia: ");
        this.agencia = sc.nextInt();
        
        System.out.println("Agencia: ");
        this.agencia = sc.nextInt();
        
        this.saldo = 0;
    }
    
    public void mostrarConta(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    
}
