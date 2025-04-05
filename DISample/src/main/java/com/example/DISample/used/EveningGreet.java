package com.example.DISample.used;

import org.springframework.stereotype.Component;

// 저녁 인사
@Component
public class EveningGreet implements Greet{
    @Override
    public String greeting(){
        return "안녕히 주무세요.";
    }
}
