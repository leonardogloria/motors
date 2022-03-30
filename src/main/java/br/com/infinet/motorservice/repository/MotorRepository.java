package br.com.infinet.motorservice.repository;

import br.com.infinet.motorservice.model.Motor;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MotorRepository {
    public List<Motor> getAll(){
        List<Motor> motors = Arrays.asList
                (Motor.builder().id(1L).fabricante("Rolls-Royce").modelo("Trent 900").build(),
                (Motor.builder().id(2L).fabricante("Bugatti").modelo("W18").build()));
        return motors;
    }
}
