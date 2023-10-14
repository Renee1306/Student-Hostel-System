/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oodjassignment;

/**
 *
 * @author ziwei
 */
public class Application {
    private String DateApplied; 
    private String StartDate; 
    private String EndDate; 
    private String TpNum; 
    private int Pax;
    private int Month;
    private double MonthlyPrice;
    private double total;
    private String Process;

    public Application() {
    }

    public String getDateApplied() {
        return DateApplied;
    }

    public void setDateApplied(String DateApplied) {
        this.DateApplied = DateApplied;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getTpNum() {
        return TpNum;
    }

    public void setTpNum(String TpNum) {
        this.TpNum = TpNum;
    }

    public int getPax() {
        return Pax;
    }

    public void setPax(int Pax) {
        this.Pax = Pax;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public double getMonthlyPrice() {
        return MonthlyPrice;
    }

    public void setMonthlyPrice(double MonthlyPrice) {
        this.MonthlyPrice = MonthlyPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getProcess() {
        return Process;
    }

    public void setProcess(String Process) {
        this.Process = Process;
    }
    
}
