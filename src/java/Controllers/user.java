/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

public class user {
    
    private int id;
    private String name;
    private String nic;
    private String email;
    private String password;
    private int role;
    
    
    public user(){}
    
    public user (int id, String name, String nic, String email,String password, int roll ){
    
    this.id=id;
    this.name=name;
    this.nic=nic;
    this.email=email;
    this.password=password;
    this.role=role;
    
    
    }
    
    public int getId(){
    return id;
    }
    
    public void setId(int id){
    this.id=id;
    
    }
    
    public String getName(){
    return name;
    }
    
    public void setName(String name){
    this.name=name;
    
    }
    
    public String getNic(){
    return nic;
    }
    
    public void setNic(String nic){
    this.nic=nic;
    
    }
    
    public String getEmail(){
    return email;
    }
    
    public void setEmail(String Email){
    this.email=email;
    
    }

   public String getPassword(){
    return password;
    }
    
    public void setPassword(String password){
    this.password=password;
    
    }

    public int getRole(){
    return role;
    }
    
    public void setRole(int role){
    this.role=role;
    
    }

   
        
    }

