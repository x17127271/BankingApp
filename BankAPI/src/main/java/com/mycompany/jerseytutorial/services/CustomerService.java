/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.databases.Database;
import com.mycompany.jerseytutorial.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class CustomerService {
          
    Database databaseData = new Database();
    private List<Customer> customerList = databaseData.getCustomersDB();
       
    
    public Customer getCustomer(long id) {
        int i = Math.toIntExact(id);
        return customerList.get(i-1);
    }
    
}
