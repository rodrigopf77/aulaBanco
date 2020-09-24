package br.com.premiumtechnology.model;

import java.util.Date;
import br.com.premiumtechnology.DAO.ClienteDAO;

public class Cliente extends Pessoa{
    private double renda;

    public Cliente(String nome) {
        super(nome);
    }
    
    public Cliente() {
        
    }
    
    @Override
    public void criarPessoa(){
        super.criarPessoa();
        
        System.out.println("Renda: ");
        this.renda = sc.nextDouble();
        
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.insert(this);
        
    }
    
    @Override
    public void mostrarPessoa(){
        super.mostrarPessoa();
        System.out.println("Renda: " + this.renda);
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
}
