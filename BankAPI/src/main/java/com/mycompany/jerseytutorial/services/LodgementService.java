/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.models.Lodgement;
import java.util.List;

/**
 *
 * @author
 */
public class LodgementService {

    private List<Customer> customerList = new Database().getCustomersDB();
    private List<Lodgement> lodgementList = new Database().getLodgementsDB();

    public List<Lodgement> getAllLodgements() {
        return lodgementList;
    }

    public List<Lodgement> getAllwithdrawalByCustomer(long customerID) {
        int i = Math.toIntExact(customerID);
        return customerList.get(i - 1).getLodgements();
    }

    public Lodgement getLodgementByID(long id) {
        int i = Math.toIntExact(id);
        return lodgementList.get(i - 1);
    }

    public Lodgement createLodgement(Lodgement lodgement) {
        lodgement.setId(lodgementList.size() + 1);
        lodgementList.add(lodgement);
        System.out.println("201 - resource created with path: /lodgement/" + String.valueOf(lodgement.getId()));
        return lodgement;
    }
}
