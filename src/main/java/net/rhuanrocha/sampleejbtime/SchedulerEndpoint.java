package net.rhuanrocha.sampleejbtime;

import javax.annotation.Resource;
import javax.ejb.TimerService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/scheduler")
public class SchedulerEndpoint {

    @Inject
    private MyTimer myTimer;


    @POST
    public Response writeSchedule(@QueryParam("message") String message){

        myTimer.initTimer(message);
        return Response.ok().build();
    }



}
