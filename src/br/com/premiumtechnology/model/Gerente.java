package br.com.premiumtechnology.model;

public class Gerente extends Funcionario{
    
    private double bonus;

    public Gerente(String nome) {
        super(nome);
    }
    
    
    
    public void calculaSalario(){
        if (this.getSalario() >= 15000) {
            this.setSalario(this.getSalario() - (this.getSalario() * 0.4));
            
        }else if(this.getSalario() >= 10000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.35));
            
        }else if(this.getSalario() >= 7500){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.3));
            
        }else if(this.getSalario() >= 5000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.25));
            
        }else{
            this.setSalario(this.getSalario() - (this.getSalario() * 0.1));
        }
        
    }
    //Assinatura de métodos (NOME E PARÂMENTROS)
    //SobreCarga de método
    public void calculaSalario(double totalVendas){
        
        totalVendas += totalVendas * 0.1;
        this.setSalario(this.getSalario() + totalVendas);
        
        if (this.getSalario() >= 15000) {
            this.setSalario(this.getSalario() - (this.getSalario() * 0.4));
            
        }else if(this.getSalario() >= 10000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.35));
            
        }else if(this.getSalario() >= 7500){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.3));
            
        }else if(this.getSalario() >= 5000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.25));
            
        }else{
            this.setSalario(this.getSalario() - (this.getSalario() * 0.1));
        }
        
    }
    public void calculaSalario(double totalVendas, double bonus){
        
        totalVendas += totalVendas * 0.1;
        this.setSalario(this.getSalario() + totalVendas);
        
        if (this.getSalario() >= 15000) {
            this.setSalario(this.getSalario() - (this.getSalario() * 0.4));
            
        }else if(this.getSalario() >= 10000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.35));
            
        }else if(this.getSalario() >= 7500){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.3));
            
        }else if(this.getSalario() >= 5000){
            this.setSalario(this.getSalario() - (this.getSalario() * 0.25));
            
        }else{
            this.setSalario(this.getSalario() - (this.getSalario() * 0.1));
        }
        
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
    
}
