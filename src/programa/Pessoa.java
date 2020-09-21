package programa;

import java.util.Date;
import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private String email;
    private String cpf;
    
    private Date dataNascimento;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarPessoa(){
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        
        System.out.println("Email: ");
        this.email = sc.nextLine();
        
        System.out.println("Cpf: ");
        this.cpf = sc.nextLine();
        
    }
    
    public void mostrarPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data Nascimento: " + this.dataNascimento);
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
    
    
    
}
