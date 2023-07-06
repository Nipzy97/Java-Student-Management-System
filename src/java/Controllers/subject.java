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
public class subject {
    
    private int id;
    private String name;
    private int credit;
    private String lec;
    
    
    public subject(){}
    
    public subject (int id, String name, int credit, String lec){
    
    this.id=id;
    this.name=name;
    this.credit=credit;
    this.lec=lec; 
    
    
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
    
    public int getCredit(){
    return credit;
    }
    
    public void setCredit(int credit){
    this.credit=credit;
    
    }
    
    public String getLec(){
    return lec;
    }
    
    public void setLec(String lec){
    this.lec=lec;
    
    }

   

    

   
        
    }

