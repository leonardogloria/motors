package br.com.infinet.motorservice.service;

import br.com.infinet.motorservice.model.Motor;
import br.com.infinet.motorservice.repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorService {
    @Autowired
    MotorRepository motorRepository;
    public List<Motor> getAll(){
        return motorRepository.getAll();
    }
}
