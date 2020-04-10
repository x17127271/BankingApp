/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Account;
import com.mycompany.jerseytutorial.models.Customer;
import java.util.List;

/**
 *
 * @author
 */
public class AccountService {
    
    private List<Customer> customerList = new Database().getCustomersDB();
    private List<Account> accountList = new Database().getAccountsDB();
    
    public List<Account> getAllAccounts() {
        return accountList;
    }
       
    public List<Account> getAllAccountsByCustomer(long customerID) {
        int i = Math.toIntExact(customerID);
        return customerList.get(i-1).getAccounts();
    }
    
     public Account getAccountByID(long id) {
        int i = Math.toIntExact(id);
        return accountList.get(i-1);
    }
     
      public Account createAccount(Account account) {
	account.setId(accountList.size() + 1);
	accountList.add(account);
	System.out.println("201 - resource created with path: /accounts/" + String.valueOf(account.getId()));
	return account;
    }
    
}
