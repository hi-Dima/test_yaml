package ru.mezencovid.test.demo.phonenotificationservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/phone")
public class NotificationController {

    @GetMapping("/notification")
    public String notification(){
        log.info("sms was sent");
        return "Чекай логи, уведомление отпралено!";
    }

}
