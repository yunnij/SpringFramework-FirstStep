package com.example.DISample.used;

import org.springframework.stereotype.Component;

// 아침 인사
// 규칙 3. 클래스에 어노테이션을 부여한다.
// 규칙 4. 스프링 프레임워크가 인스턴스를 생성하게 한다.
// @Component
public class MorningGreet implements Greet {
    @Override
    public String greeting(){
        return "좋은 아침입니다.";
    }
}
