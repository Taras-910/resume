package ua.top.bootjava.resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ResumeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }

}
