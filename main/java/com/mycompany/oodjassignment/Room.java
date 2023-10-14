/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodjassignment;

/**
 *
 * @author ziwei
 */
public class Room {
    private String RoomNo;
    private int Pax;
    private double Price;
    private String status;
    private int StudentApplied;

    public Room() {
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getPax() {
        return Pax;
    }

    public void setPax(int Pax) {
        this.Pax = Pax;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStudentApplied() {
        return StudentApplied;
    }

    public void setStudentApplied(int StudentApplied) {
        this.StudentApplied = StudentApplied;
    }
    
}
