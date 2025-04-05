package com.example.DISample;

import com.example.DISample.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // 스프링 부트 애플리케이션을 시작할 때 시작점이 되는 어노테이션
public class DiSampleApplication { // 스프링부트 시작 클래스

	// 스프링부트 시작
	// @param args

	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args)
				.getBean(DiSampleApplication.class).execute();
	}

	// 주입되는 부분 (인터페이스)
	@Autowired
	private Greet g;

	// 실행
	private void execute(){
		String msg = g.greeting();
		System.out.println(msg);
	}
}
