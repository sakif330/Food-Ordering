/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author Istehad
 */
public class restaurent {
    private String r_id; 
    private String name;
    private String  type;
    private String  location;
    private String status;
    
    public restaurent(String r_id,String name, String type, String location,String status) {
        this.r_id =r_id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status=status;
    }
    public String getr_id() {
        return r_id;
    }
    public String getname() {
        return name;
    }
     public String gettype() {
        return type;
    }
      public String getlocation() {
        return location;
    }
       public String getstatus() {
        return status;
    }
}
