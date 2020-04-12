/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Transaction;
import com.mycompany.jerseytutorial.models.Account;
import com.mycompany.jerseytutorial.models.Customer;
import java.util.List;

/**
 *
 * @author
 */
public class TransactionService {

    private List<Account> accountsList = new Database().getAccountsDB();
    private List<Transaction> transactionList = new Database().getTransactionsDB();

    public List<Transaction> getAllTransactions() {
        return transactionList;
    }

    public List<Transaction> getAllTransactionsByAccount(long accountID) {
        int i = Math.toIntExact(accountID);
        return accountsList.get(i - 1).getTransactions();
    }

    public Transaction getTransactionByID(long id) {
        int i = Math.toIntExact(id);
        return transactionList.get(i - 1);
    }

    public Transaction createTransaction(Transaction transaction) {
        transaction.setId(transactionList.size() + 1);
        transactionList.add(transaction);
        System.out.println("201 - resource created with path: /transaction/" + String.valueOf(transaction.getId()));
        return transaction;
    }
}
