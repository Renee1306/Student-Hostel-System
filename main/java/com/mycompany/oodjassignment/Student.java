    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodjassignment;

/**
 *
 * @author ziwei
 */
public class Student implements User {
    private String username;
    private String password;
    private String studentName;
    private String studentNum;
    private String studentIC;
    
    
    public String getName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentIC() {
        return studentIC;
    }

    public void setStudentIC(String studentIC) {
        this.studentIC = studentIC;
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