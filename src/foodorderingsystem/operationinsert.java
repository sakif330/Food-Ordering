/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Istehad
 */
public class operationinsert {
    private DBConnect dbcr;
    private ResultSet rsr; 

 public void saveInvoice(restaurent res) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbcr = new DBConnect();
         dbcr.connectToDB();   
         String rid = res.getr_id();
         String pp = res.getname();
         String p1 = res.gettype();
         String y = res.getlocation();
         String p=res.getstatus();
          System.out.println("r_id "+ rid);
         System.out.println("name "+ pp);
         System.out.println("type "+ p1);
         System.out.println("location "+ y);
         System.out.println("status "+ p);
         
         

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbcr.insertDataToDB("INSERT INTO Restaurant(R_ID,Name, Type, Location, Status)"
                                            + " VALUES('"+res.getr_id()+"','"+res.getname()+"', '"+res.gettype()+"', '"+res.getlocation()+"', '"+res.getstatus()+"')");
                              
         System.out.println("save or not "+ dataSaved);
         dbcr.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}
    }
        
        private void closeDB()
{
    try{
        if (rsr != null){rsr.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}

    } 
