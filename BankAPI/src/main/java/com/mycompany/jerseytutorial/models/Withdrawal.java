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
public class Withdrawal {

    private long id;
    private Date created;
    private int cardCredited;
    private double amount;

    public Withdrawal() {
    }

    public Withdrawal(long id, int cardCredited, double amount) {
        this.id = id;
        this.cardCredited = cardCredited;
        this.amount = amount;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCardCredited() {
        return cardCredited;
    }

    public void setCardCredited(int cardCredited) {
        this.cardCredited = cardCredited;
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
