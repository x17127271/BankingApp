/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.models;

import java.util.Date;

/**
 *
 * @author
 */
public class Account {
     
    private long id;
    private int shortCode;
    private int accountNumber;
    private double balance;
    
    public Account() {
        }

    public Account(long id, int shortCode, int accountNumber, double balance) {
        this.id = id;
        this.shortCode = shortCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getShortCode() { 
        return shortCode;
    }

    public void setShortCode(int shortCode) {
        this.shortCode = shortCode;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
