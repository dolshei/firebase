package com.example.firebase.config;

import com.example.firebase.config.properties.FirebaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties({
        FirebaseProperties.class
})
@PropertySource({
        "classpath:firebase/fcmmsg-a6214-firebase-adminsdk.json"
})
public class PropertiesConfig {
}
