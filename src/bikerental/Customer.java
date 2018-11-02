/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

/**
 *
 * @author anupongpummok
 */
public class Customer {
    String cusCitizenId;
    String cusTel;
    String cusFName;
    String cusLName;

    public Customer(String cusCitizenId, String cusFName, String cusLName,String cusTel) {
        this.cusCitizenId = cusCitizenId;
        this.cusTel = cusTel;
        this.cusFName = cusFName;
        this.cusLName = cusLName;
    }
    

    public String getCitizenId() {
        return cusCitizenId;
    }

    public void setCitizenId(String id) {
        this.cusCitizenId = id;
    }

    public String getTel() {
        return cusTel;
    }

    public void setTel(String phoneNumber) {
        this.cusTel = phoneNumber;
    }

    public String getFName() {
        return cusFName;
    }

    public void setFName(String fname) {
        this.cusFName = fname;
    }

    public String getLName() {
        return cusLName;
    }

    public void setLName(String lname) {
        this.cusLName = lname;
    }
    
     
    
    
}
