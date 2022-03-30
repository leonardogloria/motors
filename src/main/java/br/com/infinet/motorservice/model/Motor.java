package br.com.infinet.motorservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Motor {
    private Long id;
    private String fabricante;
    private String modelo;
    
}
