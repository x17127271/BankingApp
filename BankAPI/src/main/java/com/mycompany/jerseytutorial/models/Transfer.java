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
public class Transfer {

    private long id;
    private Date created;
    private int accountToTransfer;
    private double amount;

    public Transfer() {
    }

    public Transfer(long id, int accountToTransfer, double amount) {
        this.id = id;
        this.accountToTransfer = accountToTransfer;
        this.amount = amount;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAccountToTransfer() {
        return accountToTransfer;
    }

    public void setAccountToTransfer(int accountToTransfer) {
        this.accountToTransfer = accountToTransfer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
