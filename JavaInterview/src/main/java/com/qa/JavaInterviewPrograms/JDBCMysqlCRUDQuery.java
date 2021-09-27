package com.qa.JavaInterviewPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Create a program to execute INSERT/UPDATE/DELETE queries in MySQL through JDBC.
 */

public class JDBCMysqlCRUDQuery {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(JDBCMysqlCRUDQuery.class);

	public static void test() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb", user = "root", password="root";
        String query = "";
        boolean b;
        Connection con = null;
        Statement stmt = null;

        try {
            // 1. create connection
            con = DriverManager.getConnection(jdbcUrl, user, password);

            // 2. create query
            stmt = con.createStatement();
            query = "INSERT INTO student VALUES(103,'smith')";

            // 3. execute query
            b = stmt.execute(query);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                // 4. close the connection
                con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}