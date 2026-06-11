package dao;

import Model.Pessoa;
import Util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement; //permite executar comando sql
import java.sql.ResultSet; //permite amarzenar resultado de consulta
import java.sql.SQLException;


public class PessoaDao {
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
            System.out.println("Pessoa cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public Pessoa buscarPorNome(String nome) {
        String sql ="SELECT * FROM pessoa WHERE nome = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                return pessoa;
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }

    public void atualizar(Pessoa pessoa) {
            String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";
            try (
                    Connection conn = Conexao.getConnection();
                    PreparedStatement stmt = conn.prepareStatement(sql)
            ) {

                stmt.setString(1, pessoa.getNome());
                stmt.setInt(2, pessoa.getId());


                stmt.executeUpdate();
                System.out.println("Pessoa atualizada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar: " + e.getMessage());
            }
        }

    public void excluir(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Pessoa excluída com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
        }
    }


}
