/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Account;
import com.mycompany.jerseytutorial.services.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author
 */

@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {

    private AccountService accountService = new AccountService();
	
    @GET
    public List<Account> getAccounts(@PathParam("customerID") int id) {
        System.out.println("getAllAccountsForCustomer..."+id);
	return accountService.getAllAccounts();
    }
	
    @GET
    @Path("/{accountID}")
    public Account getAccount(@PathParam("accountID") int id) {
    	System.out.println("getAccountByID..."+id);
	return accountService.getAccountByID(id);
    }
    
    @POST
    public Account postAccount(Account account) {
	return accountService.createAccount(account);
    }
    
    @Path("/{accountID}/transactions")
    public TransactionResource getTransactionsResource() {
	System.out.println("Getting transaction subresoruces...");
	return new TransactionResource();
    }
}
