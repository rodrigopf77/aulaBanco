package br.com.premiumtechnology.DAO;

import br.com.premiumtechnology.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO {

    Scanner sc = new Scanner(System.in);

    public void insert(Cliente cliente) {

        Conexao conexao = new Conexao();
        Connection conex = conexao.getConexao();
        PreparedStatement insertBD = null;
        String SQL = "INSERT INTO cliente(nome, email, cpf, dataNascimento) values(?, ?, ?, ?)";

        try {
            insertBD = conex.prepareStatement(SQL);
            insertBD.setString(1, cliente.getNome());
            insertBD.setString(2, cliente.getEmail());
            insertBD.setString(3, cliente.getCpf());
            insertBD.setString(4, cliente.getDataNascimento().toString());

            insertBD.executeUpdate();
            System.out.println("Pessoa inserida com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir registro. Mensagem: "
                    + e.getMessage());
        } finally {
            try {
//                insertBD.close();
                conex.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operações de inserção. Mensagem: "
                        + e.getMessage());
            }
        }

    }

    public List<Cliente> listar() {

        Conexao conexao = new Conexao();
        Connection conex = conexao.getConexao();
        PreparedStatement insereSt = null;

        List<Cliente> clientes = new ArrayList<>();
        Statement consulta = null;
        ResultSet resultado = null;

        Cliente cliente = null;

        String sql = "select * from cliente";

        try {
            
            consulta = conex.createStatement();
            resultado = consulta.executeQuery(sql);
            
            while (resultado.next()) {

//                cliente.setId_pessoa(resultado.getInt("id_pessoa"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setDataNascimento(resultado.getDate("dataaniversario"));

                for (Cliente c : clientes) {

//                System.out.println("Registro: " + c.id_pessoa);
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Email: " + c.getEmail());
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                }

            }
        }catch (SQLException e) {
            System.out.println("Erro ao buscar Pessoa. Mensagem: "
                    + e.getMessage());
        }finally {
            try {
                consulta.close();
                resultado.close();
                conex.close();
            } catch (Throwable e) {
                System.out
                        .println("Erro ao fechar operações de consulta. Mensagem: "
                                + e.getMessage());
            }
        }

            return clientes;
        }

    public void excluir(int id) {
        Conexao cx = new Conexao();
        Connection conexao = cx.getConexao();
        PreparedStatement excluiSt = null;

        String sql = "delete from pessoa where id_pessoa = ?";

        try {
            excluiSt = conexao.prepareStatement(sql);
            excluiSt.setInt(1, id);
            excluiSt.executeUpdate();

            System.out.println("Registro excluido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir registro. Mensagem: "
                    + e.getMessage());
        } finally {
            try {
                excluiSt.close();
                conexao.close();
            } catch (Throwable e) {
                System.out
                        .println("Erro ao fechar operações de exclusão. Mensagem: "
                                + e.getMessage());
            }
        }
    }

    public void atualizar() {
        Conexao cx = new Conexao();
        Connection conexao = cx.getConexao();
        PreparedStatement atualizaSt = null;

        System.out.println("Código:");
        int id_pessoa = sc.nextInt();

        System.out.println("Email: ");
        String novoEmail = sc.next();

        String sql = "update pessoa set email = ?"
                + "where id_pessoa = ?";

        try {

            atualizaSt = conexao.prepareStatement(sql);
            atualizaSt.setString(1, novoEmail);
            atualizaSt.setInt(2, id_pessoa);

            atualizaSt.executeUpdate();
            System.out.println("Atualização realizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Saldo. Mensagem: " + e.getMessage());
        } finally {
            try {
                atualizaSt.close();
                conexao.close();
            } catch (Throwable e) {
                System.out
                        .println("Erro ao fechar operações de atualização. Mensagem: "
                                + e.getMessage());
            }
        }
    }

}