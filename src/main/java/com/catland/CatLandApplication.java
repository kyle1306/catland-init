package com.catland;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CatLandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatLandApplication.class, args);
        log.info("CatLand init ...");
    }

}
