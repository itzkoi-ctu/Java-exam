/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author default
 */
public class ITRequest {
    public int id;
    private String name;
    private Date date;
    private String email;
    private String type;
    private String detail;
    
    public ITRequest(){
        
    }
    public ITRequest(int id, String name,Date date, String email, String type, String detail ){
        this.id= id;
        this.date= date;
        this.name= name;
        this.email= email;
        this.type= type;
        this.detail= detail;
        
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ITRequest{" + "id=" + id + ", name=" + name + ", date=" + date + ", email=" + email + ", type=" + type + ", detail=" + detail + '}';
    }

  

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getDetail() {
        return detail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
