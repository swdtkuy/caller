package com.example.caller;

import com.example.caller.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestTempateService {

    Logger logger = LoggerFactory.getLogger(RestTempateService.class);
    
    public ResponseEntity<List<Object>> getRequestProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<>();
        params.put("id", "prod1");
        logger.info("request product service.");
        ResponseEntity response = restTemplate.getForEntity("http://product:8081/products", Object.class);
        if(response == null || response.getBody() == null || ((List<Object>)response.getBody()).isEmpty()){
            logger.error("product service is unavailable.");
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        } else {
            return response;
        }
    }
}
