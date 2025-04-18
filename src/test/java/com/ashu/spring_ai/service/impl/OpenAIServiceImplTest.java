package com.ashu.spring_ai.service.impl;

import com.ashu.spring_ai.service.OpenAIService;
import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswer() {
        String answer = openAIService.getAnswer("Hey GPT, tell me a dad joke.");
        System.out.println("Got this answer form GPT: " + answer);
    }
}