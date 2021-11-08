package com.soccer.action.rest;

import com.soccer.action.ejb.ClubEjbI;
import com.soccer.action.models.Club;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clubs")
public class ClubApi {

    @Inject
    private ClubEjbI clubEjb;

    @GET // Helps us retrieve data
    @Path("list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        Club filter = new Club();
        return Response.ok(clubEjb.list(filter, 0, 0))
                .build();
    }

    @GET
    @Path("list/{clubId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("clubId") int clubId){

        Club filter = new Club();
        filter.setId(clubId);
        return Response.ok().entity(clubEjb.list(filter, 0, 0)).build();
    }

}
