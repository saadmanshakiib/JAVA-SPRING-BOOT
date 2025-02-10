package net.engineering.journalApp.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HealthCheck {
    @GetMapping("/health")
    public String healthCheck(){
        return "Well is Well";
    }
}
