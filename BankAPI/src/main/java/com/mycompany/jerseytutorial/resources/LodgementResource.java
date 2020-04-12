/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.models.Lodgement;
import com.mycompany.jerseytutorial.services.LodgementService;
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
@Path("/lodgements")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LodgementResource {

    private LodgementService lodgementService = new LodgementService();

    @GET
    public List<Lodgement> getLodgements(@PathParam("customerID") int id) {
        System.out.println("getAlllodgementsForCustomer..." + id);
        return lodgementService.getAllLodgements();
    }

    @GET
    @Path("/{lodgementID}")
    public Lodgement getLodgement(@PathParam("lodgementID") int id) {
        System.out.println("getLodgementByID..." + id);
        return lodgementService.getLodgementByID(id);
    }

    @POST
    public Lodgement postLodgement(Lodgement lodgement) {
        return lodgementService.createLodgement(lodgement);
    }

}
