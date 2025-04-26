package ncart.pc.service;

import ncart.pc.service.controller.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NCartStarterApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(NCartStarterApplication.class, args);
        Radio radio = applicationContext.getBean(Radio.class);
        radio.run();
    }
}
