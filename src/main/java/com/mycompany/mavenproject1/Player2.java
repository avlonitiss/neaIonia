/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author Spyros
 */
public class Player2 {
    
    private String fistName;
    
    private String lastName;
    
    private Date bDate;

    public Player2(String fistName, String lastName, Date bDate) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.bDate = bDate;
    }

    public Player2(String fistName) {
        this.fistName = fistName;
        this.lastName = "XXX";
    }
    
    
    

    /**
     * Get the value of bDate
     *
     * @return the value of bDate
     */
    public Date getbDate() {
        return bDate;
    }

    /**
     * Set the value of bDate
     *
     * @param bDate new value of bDate
     */
    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }


    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get the value of fistName
     *
     * @return the value of fistName
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * Set the value of fistName
     *
     * @param fistName new value of fistName
     */
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    
    
}
