package com.example.JavaConfigSample;

import com.example.JavaConfigSample.service.BusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaConfigSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigSampleApplication.class, args)
				.getBean(JavaConfigSampleApplication.class).exe();
	}

	@Autowired
	@Qualifier("test")
	private BusinessLogic business1; // TestLogicImpl 인스턴스

	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2; // SampleLogicImpl 인스턴스

	public void exe() {
		business1.doLogic();
		business2.doLogic();
	}
}
