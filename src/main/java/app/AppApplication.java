package app;


import app.service.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		calculator.runCalculator();
	}
}