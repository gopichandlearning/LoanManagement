package com.loanmanagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


@RestController
public class LoanEligibleController {

    @GetMapping("/IsEligible")
    public String IsEligible() {
        return "Hello, world!";
    }
}