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
public class marks {
    private int userID;
    private int subjectID;
    private String subject;
    private int marks;
    private String coloumn;
    
    
    
    public marks(){}
    
    public marks (int userID, int subjectID, String subject, int marks, String coloumn ){
    
    this.userID=userID;
    this.subjectID=subjectID;
    this.subject=subject;
    this.marks=marks;
    this.coloumn=coloumn;
    
    
    
    }
    
    public int getuserID(){
    return userID;
    }
    
    public void setUserID(int userID){
    this.userID=userID;
    
    }
    
    public int getSubjectID(){
    return subjectID;
    }
    
    public void setSubjectID(int subjectID){
    this.subjectID=subjectID;
    
    }
    
    public String getSubject(){
    return subject;
    }
    
    public void setSubject(String Subject){
    this.subject=subject;
    
    }
    
    public int getaMarks(){
    return marks;
    }
    
    public void setMarks(int Marks){
    this.marks=marks;
    
    }

   public String getColoumn(){
    return coloumn;
    }
    
    public void setColoumn(String coloumn){
    this.coloumn=coloumn;
    
    }
    
    }



