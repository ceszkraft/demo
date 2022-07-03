package com.example.demo.controllers;

import java.net.MalformedURLException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.MAPFREModel;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MPFREController {
    
    @PostMapping
    public String send(@RequestBody MAPFREModel model) throws MalformedURLException{
        
        return "";
    }

    @GetMapping
    public MAPFREModel fetch(){
        String uri = "https://wm2.bbmapfre.com.br/ws/bbmCobrancaRegistrada.wsd.provider.RegistroTitutloCobrancaWS/RegistroTitutloCobrancaWSPort";
        RestTemplate restTemplate = new RestTemplate();
        MAPFREModel result = restTemplate.getForObject(uri, MAPFREModel.class);
        return result;
    }



}
