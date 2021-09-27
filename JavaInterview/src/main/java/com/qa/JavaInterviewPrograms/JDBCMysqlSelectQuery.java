package com.qa.JavaInterviewPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Create a program to execute SELECT query in MySQL through JDBC.
 */

public class JDBCMysqlSelectQuery {

    //Initialize Log4j instance
	private static final Logger log =  LogManager.getLogger(JDBCMysqlSelectQuery.class);

	public static void test() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb", user = "root", password="root";
        String query = "";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. create connection
            con = DriverManager.getConnection(jdbcUrl, user, password);

            // 2. create query
            stmt = con.createStatement();
            query = "SELECT emp_id, f_name, l_name, emp_address FROM employee";

            // 3. execute query & store data in ResultSet
            rs = stmt.executeQuery(query);

            // 4. Display the fetched data
            while(rs.next()){
                int emp_id = rs.getInt("emp_id");
                String f_name = rs.getString("f_name");
                String l_name = rs.getString("l_name");
                String emp_address = rs.getString("emp_address");

                System.out.println("ID: " + emp_id + ",\t Name: " + f_name + " " + l_name + ",\t Address: " + emp_address);
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                // 5. close the connection
                con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}