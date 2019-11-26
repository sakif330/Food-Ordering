/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import foodorderingsystem.Student;
/**
 *
 * @author Sera
 */
public class Operation {
    private DBConnect dbc;
    private ResultSet rs; 
    
    //public void Operation() throws SQLException
    public void Operation()
    {
        //dbc = new DBConnect();
        //rs = null;               
    }
    
    public void saveInvoice(Student stu) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         String pp = stu.getFirstName();
         String p1 = stu.getLastName();
         String y = stu.getuserid();
         String p=stu.getpassword();
         System.out.println("firstname "+ pp);
         System.out.println("lastname "+ p1);
         System.out.println("userid "+ y);
         System.out.println("password "+ p);
         
         

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO student(firstName, lastName, userid, password)"
                                            + " VALUES('"+stu.getFirstName()+"', '"+stu.getLastName()+"', '"+stu.getuserid()+"', '"+stu.getpassword()+"')");
                              
         System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}

    } 
    
 private void closeDB()
{
    try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}
}
