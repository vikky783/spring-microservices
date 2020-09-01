package com.vikky.microservice.limitsevice.beans;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
    @RequestMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration() {
        return new LimitConfiguration(11,20);
    }
}
