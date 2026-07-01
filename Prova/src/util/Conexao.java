package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL="jbdc:mysql://localhost:3306/";
    private static final String USUARIO="root";
    private static final String SENHA="emi#luy8";

    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}

