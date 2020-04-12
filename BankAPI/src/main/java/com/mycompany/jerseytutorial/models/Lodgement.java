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
public class Lodgement {

    private long id;
    private Date created;
    private int creditCardDebited;
    private double amount;

    public Lodgement() {
    }

    public Lodgement(long id, int creditCardDebited, double amount) {
        this.id = id;
        this.creditCardDebited = creditCardDebited;
        this.amount = amount;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCreditCardDebited() {
        return creditCardDebited;
    }

    public void setCreditCardDebited(int creditCardDebited) {
        this.creditCardDebited = creditCardDebited;
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
