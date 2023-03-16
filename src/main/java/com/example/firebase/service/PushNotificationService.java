package com.example.firebase.service;

import com.example.firebase.dto.PushNotificationRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationService {

    private Logger logger = LoggerFactory.getLogger(PushNotificationService.class);

    private FCMService fcmService;

    public PushNotificationService(FCMService fcmService) {
        this.fcmService = fcmService;
    }


    public void sendPushNotificationToToken(PushNotificationRequestDto request) {
        try {
            fcmService.sendMessageToToken(request);
            logger.info("sendPushNotificationToToken->sendMessageToToken request : " + request);
        } catch (Exception e) {
            logger.info("sendPushNotificationToToken->Exception request : " + request);
            logger.error(e.getMessage());
        }
    }

}
