/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.models.Transfer;
import java.util.List;

/**
 *
 * @author guzma
 */
public class TransferService {

    private List<Customer> customerList = new Database().getCustomersDB();
    private List<Transfer> transferList = new Database().getTransfersDB();

    public List<Transfer> getAllTransfers() {
        return transferList;
    }

    public List<Transfer> getAllTransferByCustomer(long customerID) {
        int i = Math.toIntExact(customerID);
        return customerList.get(i - 1).getTransfers();
    }

    public Transfer getTransferByID(long id) {
        int i = Math.toIntExact(id);
        return transferList.get(i - 1);
    }

    public Transfer createTransfer(Transfer transfer) {
        transfer.setId(transferList.size() + 1);
        transferList.add(transfer);
        System.out.println("201 - resource created with path: /transfer/" + String.valueOf(transfer.getId()));
        return transfer;
    }
}
