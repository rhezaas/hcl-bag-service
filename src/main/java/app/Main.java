package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping(value = "/")
    public String index() {
        return "Bag Service is Running";
    }
}