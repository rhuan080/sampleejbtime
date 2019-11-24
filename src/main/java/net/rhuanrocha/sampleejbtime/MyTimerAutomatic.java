package net.rhuanrocha.sampleejbtime;


import javax.ejb.Schedule;
import javax.ejb.Singleton;
import java.util.logging.Logger;

@Singleton
public class MyTimerAutomatic {

    private Logger logger = Logger.getLogger(MyTimerAutomatic.class.getName());

    @Schedule(hour = "*", minute = "*",second = "0,10,20,30,40,50",persistent = false)
    public void execute(){

        logger.info("Automatic timer executing");

    }
}
