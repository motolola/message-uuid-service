package com.tantalumcorporation.microservice.uuidservice.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class UUIDGeneratorController {

    @Value("${app.uuid.prefix}")
    private String uuidPrefix;

    @Value("${app.uuid.surfix}")
    private String uuidSurfix;

    @GetMapping("test")
    public String test()
    {
        return "Your UUID";
    }
    @GetMapping("get_uuid")
    public String generateUUID()
    {
        UUID uuid =  UUID.randomUUID();
        return uuidPrefix+"-"+uuid+"-"+uuidSurfix;
    }
}
