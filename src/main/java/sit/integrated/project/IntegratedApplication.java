package sit.integrated.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication

public class IntegratedApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegratedApplication.class, args);
    }

}
