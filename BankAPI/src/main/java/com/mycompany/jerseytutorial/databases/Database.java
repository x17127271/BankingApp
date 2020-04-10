/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.databases;

import com.mycompany.jerseytutorial.models.Account;
import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.models.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class Database {

    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static List<Transaction> transactionDB = new ArrayList<>();
    public static boolean init = true;

    // Constructor for the class
    public Database() {
        if (init) {
            // Creating an Account data
            Account accountOne = new Account(1, 445, 111111111, 1250.24);

            accountDB.add(accountOne);

            //creating Transaction data
            Transaction transactionOne = 
                    new Transaction(1, "Debit", "Spar Grocery", 1200.24);
            
            transactionDB.add(transactionOne);
            
            //add Customer data
            //add Accounts and Transaction to the Customer.
            Customer customerOne
                    = new Customer(1, "Darth Vader", "DarthVader@deathStar.com",
                            "Level 5, Suit Dark", "darkSideIsGoodStuff", 
                            accountDB, transactionDB);

            customerDB.add(customerOne);

            init = false;
        }
    }

    public static List<Customer> getCustomersDB() {
        return customerDB;
    }

    public static List<Account> getAccountsDB() {
        return accountDB;
    }
    
    public static List<Transaction> getTransactionsDB() {
        return transactionDB;
    }
}
