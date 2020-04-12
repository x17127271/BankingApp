/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.models;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author
 */
@XmlRootElement
public class Customer {

    private long id;
    private String name;
    private String email;
    private String address;
    private String password;
    private Date created;
    private List<Account> accounts;
    private List<Withdrawal> withdrawals;
    private List<Transfer> transfers;
    private List<Lodgement> lodgements;

    public Customer() {
    }

    public Customer(long id, String name, String email, String address,
            String password, List<Account> accounts, List<Withdrawal> withdrawals,
            List<Transfer> transfers, List<Lodgement> lodgements) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.created = new Date();
        this.accounts = accounts;
        this.withdrawals = withdrawals;
        this.transfers = transfers;
        this.lodgements = lodgements;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }  

    public List<Withdrawal> getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(List<Withdrawal> withdrawals) {
        this.withdrawals = withdrawals;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
    
      public List<Lodgement> getLodgements() {
        return lodgements;
    }

    public void setLodgements(List<Lodgement> lodgements) {
        this.lodgements = lodgements;
    }

}
