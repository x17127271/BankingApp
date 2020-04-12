/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Transfer;
import com.mycompany.jerseytutorial.services.TransferService;
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
@Path("/tranfers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransferResource {

    private TransferService transferService = new TransferService();

    @GET
    public List<Transfer> getTransfers(@PathParam("customerID") int id) {
        System.out.println("getAllTransfersForCustomer..." + id);
        return transferService.getAllTransfers();
    }

    @GET
    @Path("/{transferID}")
    public Transfer getTransfer(@PathParam("transferID") int id) {
        System.out.println("getTransferByID..." + id);
        return transferService.getTransferByID(id);
    }

    @POST
    public Transfer postTransfer(Transfer transfer) {
        return transferService.createTransfer(transfer);
    }

}
