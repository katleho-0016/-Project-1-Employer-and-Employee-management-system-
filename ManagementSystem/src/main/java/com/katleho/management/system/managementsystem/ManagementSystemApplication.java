package com.katleho.management.system.managementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.katleho.management.system.managementsystem.Employee.controller",
        "com.katleho.management.system.managementsystem.Employee.repository",
        "com.katleho.management.system.managementsystem.Employee"
})
public class ManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementSystemApplication.class, args);
    }

}
