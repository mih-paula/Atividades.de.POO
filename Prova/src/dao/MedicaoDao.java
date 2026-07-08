package dao;

import model.Medicao;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicaoDao {

    public void inserir(Medicao medicao) {
        String sql = "INSERT INTO medicao(id, valor, unidade, dataHora) VALUES(?, ?, ?, ?)";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, medicao.getId());
            stmt.setDouble(2, medicao.getValor());
            stmt.setString(3, medicao.getUnidade());
            stmt.setString(4, medicao.getDataHora());
            stmt.executeUpdate();
            System.out.println("Medicao cadastrada!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    public Medicao consultarPorId(int id) {
        String sql = "SELECT * FROM medicao WHERE codigo = ?";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Medicao medicao = new Medicao();
                    medicao.setId(rs.getInt("codigo"));
                    medicao.setValor(rs.getDouble("valor"));
                    medicao.setUnidade(rs.getString("unidade"));
                    medicao.setDataHora(rs.getString("dataHora"));
                    return medicao;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar por id: " + e.getMessage());
        }
        return null;
    }
}