package net.rhuanrocha.sampleejbtime;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import java.util.logging.Logger;

@Stateless
public class MyTimer {

    private Logger logger = Logger.getLogger(MyTimer.class.getName());
    @Resource
    private SessionContext context;

    public void initTimer(String message){
        context.getTimerService().createTimer(10000, message);
    }



    @Timeout
    public void execute(){
        logger.info("Starting");

        context.getTimerService().getAllTimers().stream().forEach(timer -> logger.info(String.valueOf(timer.getInfo())));


        logger.info("Ending");
    }


}
