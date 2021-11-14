package com.javafh.cicdgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdGithubActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdGithubActionsApplication.class, args);
    }


    @GetMapping("/hi")
    public String getCiCdGithubString() {
        return "Hi ,Be patient bro we are trying to setup CI/CD";
    }

}
