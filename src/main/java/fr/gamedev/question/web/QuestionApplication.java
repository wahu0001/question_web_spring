package fr.gamedev.question.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author djer13
 *
 */
@SpringBootApplication(proxyBeanMethods = false)
public class QuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionApplication.class, args);
	}

}
