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
    private Date date;
    private String description;
    private double upatedBalance;

    public Transaction() {
    }

    public Transaction(long id, String type, String description, double upatedBalance) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.upatedBalance = upatedBalance;
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

    public double getUpatedBalance() {
        return upatedBalance;
    }

    public void setUpatedBalance(double upatedBalance) {
        this.upatedBalance = upatedBalance;
    }

}
