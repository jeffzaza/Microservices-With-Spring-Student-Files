package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

    @Autowired
    RestTemplate template;

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return
        getWord("MY-LAB-6-SUBJECT") + " " +
            getWord("MY-LAB-6-VERB") + " " +
            getWord("MY-LAB-6-ARTICLE") + " " +
            getWord("MY-LAB-6-ADJECTIVE") + " " +
            getWord("MY-LAB-6-NOUN") + ".";
    }

    public String getWord(String service) {
    	return template.getForObject("http://" + service, String.class);
    }
}