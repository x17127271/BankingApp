/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Withdrawal;
import com.mycompany.jerseytutorial.services.WithdrawalService;
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
@Path("/withdrawals")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WithdrawalResource {

    private WithdrawalService withdrawalService = new WithdrawalService();

    @GET
    public List<Withdrawal> getWithdrawals(@PathParam("customerID") int id) {
        System.out.println("getAllWithdrawalsForCustomer..." + id);
        return withdrawalService.getAllWithdrawals();
    }

    @GET
    @Path("/{withdrawalID}")
    public Withdrawal getWithdrawal(@PathParam("withdrawalID") int id) {
        System.out.println("getWithdrawalByID..." + id);
        return withdrawalService.getWithdrawalByID(id);
    }

    @POST
    public Withdrawal postWithdrawal(Withdrawal withdrawal) {
        return withdrawalService.createWithdrawal(withdrawal);
    }

}
