package spring.boot.nauka;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by Piotr Kulma on 22.05.15.
 */


public class ScheduledTask {
    @Scheduled(fixedRate = 2000)
    public void doTask() {
        System.out.println("ScheduledTask: " + new Date());
    }
}
