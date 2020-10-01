package br.com.premiumtechnology.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private String email;
    private String cpf;
    private String dNascimento;
    private Date dataNascimento;
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    Scanner sc = new Scanner(System.in);

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
    
    
    
    public void criarPessoa(){
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        
        System.out.println("Email: ");
        this.email = sc.nextLine();
        
        System.out.println("Cpf: ");
        this.cpf = sc.nextLine();
        
        System.out.println("Data nascimento: " + this.dataNascimento);
        this.dNascimento = sc.next();
        
        try{
            this.dataNascimento = df.parse(this.dNascimento);
        }catch(ParseException e){
            System.out.print("Data inválida! " + e.getMessage());
            this.criarPessoa();
        }
        
    }
    
    public void mostrarPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data Nascimento: " + this.df.format(dataNascimento));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getdNascimento() {
        return dNascimento;
    }

    public void setdNascimento(String dNascimento) {
        this.dNascimento = dNascimento;
    }
    
}
