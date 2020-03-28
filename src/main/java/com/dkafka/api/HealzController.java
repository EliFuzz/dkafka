package com.dkafka.api;

import com.dkafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/healz")
class HealzController {
    @Autowired
    Producer producer;

    @GetMapping(value = "/")
    public HttpStatus producer() {
        producer.send("Healz");

        return HttpStatus.OK;
    }
}
