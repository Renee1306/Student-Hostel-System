/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodjassignment;

/**
 *
 * @author ziwei
 */
public class Payment {
    private String DateAppl;
    private int Month;
    private String TpNum; 
    private int RoomNo;
    private int Pax;
    private double MonthlyPrice;
    private String Status;
    private String PaymentDate;

    public Payment() {
    }

    public String getDateAppl() {
        return DateAppl;
    }

    public void setDateAppl(String DateAppl) {
        this.DateAppl = DateAppl;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public String getTpNum() {
        return TpNum;
    }

    public void setTpNum(String TpNum) {
        this.TpNum = TpNum;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getPax() {
        return Pax;
    }

    public void setPax(int Pax) {
        this.Pax = Pax;
    }

    public double getMonthlyPrice() {
        return MonthlyPrice;
    }

    public void setMonthlyPrice(double MonthlyPrice) {
        this.MonthlyPrice = MonthlyPrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }
}
