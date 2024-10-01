package com.osiel.ApiT.controller;

import com.osiel.ApiT.model.Tenis;
import com.osiel.ApiT.service.TenisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tenis")
public class TenisController {

    @Autowired
    private TenisService tenisService;

    @GetMapping("/aleatorio")
    public Tenis getTenisAleatorio(){
        return tenisService.getTenisAleatorio();
    }
}
