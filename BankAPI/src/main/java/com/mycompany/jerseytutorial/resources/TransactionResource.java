/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Transaction;
import com.mycompany.jerseytutorial.services.TransactionService;
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

@Path("/transactions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransactionResource {

    private TransactionService transactionService = new TransactionService();
	
    @GET
    public List<Transaction> getTransactions(@PathParam("accountID") int id) {
        System.out.println("getAllTransactionsForAccount..."+id);
	return transactionService.getAllTransactions();
    }
	
    @GET
    @Path("/{transactionID}")
    public Transaction getTransaction(@PathParam("transactionID") int id) {
    	System.out.println("getTransactionByID..."+id);
	return transactionService.getTransactionByID(id);
    }
    
    @POST
    public Transaction postTransaction(Transaction transaction) {
	return transactionService.createTransaction(transaction);
    }
    
}
