package org.rd.lessons.lesson17.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnectionExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test_user";
        String kullaniciAdi = "postgres";
        String sifre = "123456";

        try {
            Connection connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            if (connection != null) {
                System.out.println("PostgreSQL veritabanına bağlantı başarılı!");
                // Veritabanı işlemleri burada yapılabilir.
                connection.close();
            }
        } catch (SQLException e) {

            System.out.println("Bağlantı hatası: " + e.getMessage());
        }
    }
}
