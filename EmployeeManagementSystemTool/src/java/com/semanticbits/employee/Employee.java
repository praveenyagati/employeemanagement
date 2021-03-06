package com.semanticbits.employee;
// Generated 14 May, 2013 6:31:35 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Employee generated by hbm2java
 */
@Component("employee")
public class Employee  implements java.io.Serializable {


     private String emailid;
     private String password;
     private String firstname;
     private String lastname;
     private String usertype;
     private Double salary;
     private Set roleses = new HashSet(0);

    public Employee() {
    }

	
    public Employee(String emailid) {
        this.emailid = emailid;
    }
    public Employee(String emailid, String password, String firstname, String lastname, String usertype, Double salary, Set roleses) {
       this.emailid = emailid;
       this.password = password;
       this.firstname = firstname;
       this.lastname = lastname;
       this.usertype = usertype;
       this.salary = salary;
       this.roleses = roleses;
    }
   
    public String getEmailid() {
        return this.emailid;
    }
    
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    public Double getSalary() {
        return this.salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Set getRoleses() {
        return this.roleses;
    }
    
    public void setRoleses(Set roleses) {
        this.roleses = roleses;
    }




}


