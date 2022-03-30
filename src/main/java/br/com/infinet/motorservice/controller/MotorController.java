package br.com.infinet.motorservice.controller;

import br.com.infinet.motorservice.model.Motor;
import br.com.infinet.motorservice.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MotorController {
    @Autowired
    MotorService motorService;
    @GetMapping
    public ResponseEntity<? > getAll(){
        List<Motor> all = motorService.getAll();
        return ResponseEntity.ok().body(all);
    }
}
