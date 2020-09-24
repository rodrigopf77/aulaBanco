package br.com.premiumtechnology.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    String driver = "org.postgresql.Driver";
    final String url = "jdbc:postgresql://localhost:5432/bancobd";
    final String usuario = "postgres";
    final String senha = "root";
    Connection conexao;
    
    public Connection getConexao() {
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);


        } catch (Exception e) {
			System.out.println("Erro de SQL. Erro: " + e.getMessage());
		} 
        return conexao;
    }
    
}
