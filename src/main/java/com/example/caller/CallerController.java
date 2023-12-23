package com.example.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CallerController {
    
    @Autowired
    RestTempateService restTemplateService;
    @GetMapping(value = "/products")
    public ResponseEntity<List<Object>> getProduct() {
        return restTemplateService.getRequestProducts();
    }
}
