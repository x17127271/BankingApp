/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 *
 * @author
 */

public class Transaction {

    private long id;
    private String type;
    private Date created;
    private String description;
    private double amount;
    private long accountId;

    public Transaction() {
    }

    public Transaction(long id, String type, String description, double amount, long accountId) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.created = new Date();
        this.accountId = accountId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    
     public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

}
