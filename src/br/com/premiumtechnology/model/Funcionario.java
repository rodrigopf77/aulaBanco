package br.com.premiumtechnology.model;

public class Funcionario extends Pessoa{
    
    private double salario;
    private double totalVendas;
    private double comissao;

    public Funcionario(String nome) {
        super(nome);
    }

    
    
    @Override
    public void criarPessoa(){
        super.criarPessoa();
        
        System.out.println("Salario: ");
        this.salario = this.sc.nextDouble();
        
        System.out.println("Salario: ");
        this.salario = this.sc.nextDouble();
        
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    
}
