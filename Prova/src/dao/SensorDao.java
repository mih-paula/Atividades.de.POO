package dao;

import model.Sensor;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SensorDao {

    public void inserir(Sensor sensor) {
        String sql = "INSERT INTO sensor(id, codigo, tipo, localizacao) VALUES(?, ?, ?, ?)";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, sensor.getId());
            stmt.setString(2, sensor.getCodigo());
            stmt.setString(3, sensor.getTipo());
            stmt.setString(4, sensor.getLocalizacao());
            stmt.executeUpdate();
            System.out.println("Sensor cadastrado!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }
    public Sensor consultarPorCodigo(String codigo) {
        String sql = "SELECT * FROM sensor WHERE codigo = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Sensor sensor = new Sensor();
                    sensor.setId(rs.getInt("id"));
                    sensor.setCodigo(rs.getString("codigo"));
                    sensor.setTipo(rs.getString("tipo"));
                    sensor.setLocalizacao(rs.getString("localizacao"));
                    return sensor;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
        return null;
    }
}