package com.company;


import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBCP {
    private static Properties propeties = new Properties();
    private static DataSource dataSource;

    static {
        try {
            FileInputStream inputStream = new FileInputStream("aa.properties");
            propeties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataSource dataSource = BasicDataSourceFactory.createDataSource(propeties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
