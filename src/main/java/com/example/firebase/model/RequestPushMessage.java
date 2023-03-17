package com.example.firebase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RequestPushMessage {
    MORING_DIET("아침 식사 드셨나요?", "아침 식사를 할 수 있는 식당 소개합니다."),
    LUNCH_DIET("점심 식사 드셨나요?", "점심 식사를 할 수 있는 식당 소개합니다."),
    DINNER_DIET("저녁 식사 드셨나요?", "저녁 식사를 할 수 있는 식당 소개합니다.");

    String title;
    String body;
}
