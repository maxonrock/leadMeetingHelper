package ru.cloudcrew.leadmeetinghelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class LeadMeetingHelperApplication  {

    public static void main(String[] args) {
        SpringApplication.run(LeadMeetingHelperApplication.class, args);
    }

}
