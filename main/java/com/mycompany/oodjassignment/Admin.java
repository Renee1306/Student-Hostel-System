/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodjassignment;



public class Admin implements User {
    private String username;
    private String password;
    
    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public boolean adminLogin(){
        boolean login = false;
        if (username.equals("Admin") && password.equals("Admin123")) {
            login = true;
        }
        return login;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
