package mk.springframework.mkbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MkBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkBeerServiceApplication.class, args);
	}

}
