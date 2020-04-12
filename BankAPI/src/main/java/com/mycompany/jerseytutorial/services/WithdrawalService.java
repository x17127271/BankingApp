/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.models.Withdrawal;
import java.util.List;

/**
 *
 * @author
 */
public class WithdrawalService {

    private List<Customer> customerList = new Database().getCustomersDB();
    private List<Withdrawal> withdrawalList = new Database().getWithdrawalsDB();

    public List<Withdrawal> getAllWithdrawals() {
        return withdrawalList;
    }

    public List<Withdrawal> getAllwithdrawalByCustomer(long customerID) {
        int i = Math.toIntExact(customerID);
        return customerList.get(i - 1).getWithdrawals();
    }

    public Withdrawal getWithdrawalByID(long id) {
        int i = Math.toIntExact(id);
        return withdrawalList.get(i - 1);
    }

    public Withdrawal createWithdrawal(Withdrawal withdrawal) {
        withdrawal.setId(withdrawalList.size() + 1);
        withdrawalList.add(withdrawal);
        System.out.println("201 - resource created with path: /withdrawal/" + String.valueOf(withdrawal.getId()));
        return withdrawal;
    }
}
