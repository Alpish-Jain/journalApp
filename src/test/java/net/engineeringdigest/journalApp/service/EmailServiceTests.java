package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void sendEmail(){
        emailService.sendEmail("radh0504@gmail.com","Testing Java Mail Sender",
                "Hi, seems like this is working fine!");
    }

}
