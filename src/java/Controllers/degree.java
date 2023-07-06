/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Admin
 */
public class degree {
    
   
    
    private int id;
    private String name;
    private String semester;
    private String type;
    
    
    public degree(){}
    
    public degree (int id, String name, String semester, String type){
    
    this.id=id;
    this.name=name;
    this.semester=semester;
    this.type=type; 
    
    
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
    
    public String getSemester(){
    return semester;
    }
    
    public void setSemester(String semester){
    this.semester=semester;
    
    }
    
    public String getType(){
    return type;
    }
    
    public void setType(String type){
    this.type=type;
    
    }

   

    

   
        
    }

