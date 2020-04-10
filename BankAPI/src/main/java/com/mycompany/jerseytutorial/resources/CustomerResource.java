/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Customer;
import com.mycompany.jerseytutorial.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

/**
 *
 * @author
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
    
    CustomerService customerService = new CustomerService();
         
    @GET
    @Path("/{customerId}")
    public Customer getCustomer(@PathParam("customerId") int id) {
        return customerService.getCustomer(id);
    }
        
    
    @Path("/{customerID}/accounts")
    public AccountResource getAccountsResource() {
	System.out.println("Getting accounts subresoruces...");
	return new AccountResource();
    }

}
