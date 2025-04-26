package ncart.pc.service.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Radio {

    @Value("${frequency}")
    private int frequency;
    @Value("${radioType}")
    private String radioType;

    public void run() {
        System.out.println("Frequency:" + getFrequency() + "Radio Type" + getRadioType());
    }
}
