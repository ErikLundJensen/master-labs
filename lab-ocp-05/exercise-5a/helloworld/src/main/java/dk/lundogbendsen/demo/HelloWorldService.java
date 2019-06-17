package dk.lundogbendsen.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldService {

    @RequestMapping("/greeting")
    public String sayHelloWorld() {
        return "Hello world";
    }
}