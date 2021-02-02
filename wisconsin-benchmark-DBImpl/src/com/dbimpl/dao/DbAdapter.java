package com.dbimpl.dbwiscops.dao;

import java.sql.*;

public class DbAdapter
{
    /* ---- Connection Variables ---- */
    String jdbUrl = "jdbc:postgresql://35.230.93.148:5432/postgres";
    String username = "postgres";
    String password = "melcow4#";

    /* ----Database Variables ---- */
    public Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /*
    Connect to Database
     */
    public void connect ()
    {

        try {
            conn = DriverManager.getConnection(jdbUrl, username, password);

            // Print DB connection success message
            System.out.println("Database Connection is established");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn()
    {

        return conn;
    }

    /* ----Disconnect from database----*/
    public void disconnect() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
