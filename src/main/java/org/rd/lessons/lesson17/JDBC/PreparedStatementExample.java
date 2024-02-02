package org.rd.lessons.lesson17.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test_user";
        String kullaniciAdi = "postgres";
        String sifre = "123456";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);

            // Kullanıcıdan alınan girişler
            String kullaniciAdiGiris = "serkan";
            String sifreGiris = "123456";


            String sqlSorgusu = "SELECT * FROM test_user WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sqlSorgusu);

            // Parametreler atanıyor
            preparedStatement.setString(1, kullaniciAdiGiris);
            preparedStatement.setString(2, sifreGiris);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                // Diğer sütunların alınması
                System.out.println("ID: " + id + ", Username: " + username + ", Password: " + password);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
