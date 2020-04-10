/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Transaction;
import com.mycompany.jerseytutorial.models.Customer;
import java.util.List;

/**
 *
 * @author
 */
public class TransactionService {
     private List<Customer> customerList = new Database().getCustomersDB();
    private List<Transaction> transactionList = new Database().getTransactionsDB();
    
    public List<Transaction> getAllTransactions() {
        return transactionList;
    }
       
    public List<Transaction> getAllTransactionByCustomer(long customerID) {
        int i = Math.toIntExact(customerID);
        return customerList.get(i-1).getTransactions();
    }
    
     public Transaction getTransactionByID(long id) {
        int i = Math.toIntExact(id);
        return transactionList.get(i-1);
    }
     
      public Transaction createTransaction(Transaction transaction) {
	transaction.setId(transactionList.size() + 1);
	transactionList.add(transaction);
	System.out.println("201 - resource created with path: /transaction/" + String.valueOf(transaction.getId()));
	return transaction;
    }
}
