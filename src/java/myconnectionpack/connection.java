/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconnectionpack;

/**
 *
 * @author khsci5mca17031
 */
import java.io.*;
import java.sql.*;

public class connection {
    public Connection jdbcconnect()
    {
        Connection con=null;
     try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cirp","root","");
               System.out.println("#Successful#");
            }
            catch(Exception e)
            {
                System.out.println("exception:"+e);
            }
     return con;
    }
    
}