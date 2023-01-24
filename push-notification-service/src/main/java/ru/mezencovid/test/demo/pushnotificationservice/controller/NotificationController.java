package ru.mezencovid.test.demo.pushnotificationservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/push")
public class NotificationController {

    @PostMapping("/notification")
    public String notification(){
        log.info("push was sent");
        return "Чекай логи, уведомление отпралено!";
    }

}
