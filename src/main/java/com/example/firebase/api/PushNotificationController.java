package com.example.firebase.api;

import com.example.firebase.dto.PushNotificationRequestDto;
import com.example.firebase.dto.PushNotificationResponseDto;
import com.example.firebase.service.PushNotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushNotificationController {
    private PushNotificationService pushNotificationService;

    private Logger logger = LoggerFactory.getLogger(PushNotificationController.class);

    public PushNotificationController(PushNotificationService pushNotificationService) {
        this.pushNotificationService = pushNotificationService;
    }

    @PostMapping("/notification/sendPush")
    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequestDto request) {
        logger.info("sendTokenNotification(request) : " + request);
        pushNotificationService.sendPushNotificationToToken(request);
        return new ResponseEntity<>(new PushNotificationResponseDto(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

}
