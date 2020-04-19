/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.databases;

import com.mycompany.jerseytutorial.models.Account;
import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.models.Lodgement;
import com.mycompany.jerseytutorial.models.Transaction;
import com.mycompany.jerseytutorial.models.Transfer;
import com.mycompany.jerseytutorial.models.Withdrawal;
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
    public static List<Withdrawal> withdrawalDB = new ArrayList<>();
    public static List<Transfer> transferDB = new ArrayList<>();
    public static List<Lodgement> lodgementDB = new ArrayList<>();
    public static boolean init = true;

    // Constructor for the class
    public Database() {
        if (init) {

            //creating Transaction data
            Transaction transactionOne
                    = new Transaction(1, "Debit", "Spar Grocery", 54.68,1);

            transactionDB.add(transactionOne);

            // Creating an Account data
            Account accountOne = new Account(1, 445, 111111111, "Savings",
                    1250.24, transactionDB);

            accountDB.add(accountOne);

            //creating withdrawal data
            Withdrawal withdrawalOne = new Withdrawal(1, 64422545, 600.89);
            withdrawalDB.add(withdrawalOne);

            //creating transfer data
            Transfer transferOne = new Transfer(1, 25252525, 521.23);
            transferDB.add(transferOne);

            //creating lodgement data
            Lodgement lodgementOne = new Lodgement(1, 67766666, 521.23);
            lodgementDB.add(lodgementOne);

            //add Customer data            
            Customer customerOne
                    = new Customer(1, "Darth Vader", "DarthVader@deathStar.com",
                            "Level 5, Suit Dark", "darkSideIsGoodStuff",
                            accountDB, withdrawalDB, transferDB, lodgementDB);

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

    public static List<Withdrawal> getWithdrawalsDB() {
        return withdrawalDB;
    }

    public static List<Transfer> getTransfersDB() {
        return transferDB;
    }

    public static List<Lodgement> getLodgementsDB() {
        return lodgementDB;
    }
}
