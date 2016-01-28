/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;


/**
 *
 * @author Jean-Marie
 */
public class Login {
   
    //Attributes 
    private String userName;
    private String password;
    
   //Constructor
    public Login(String uN,String p){
    userName = uN;
    password = p;
    }
    
    public String getUserN(){return userName;}
    
    public String getPassW(){return password;}
}
