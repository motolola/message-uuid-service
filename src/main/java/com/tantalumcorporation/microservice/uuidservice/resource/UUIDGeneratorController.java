package com.tantalumcorporation.microservice.uuidservice.resource;

import com.tantalumcorporation.microservice.uuidservice.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class UUIDGeneratorController {

    @Autowired
    private Configuration configuration;

    @GetMapping("get_uuid")
    public String generateUUID()
    {
        UUID uuid =  UUID.randomUUID();
        return configuration.getPrefix()+"-"+uuid+"-"+configuration.getSurfix();
    }
}
