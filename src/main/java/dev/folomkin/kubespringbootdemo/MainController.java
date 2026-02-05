package dev.folomkin.kubespringbootdemo;

import org.slf4j.helpers.Slf4jEnvUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class MainController {

    @GetMapping
    public String hello(){
        return "Hello from Kube";
    }

    @GetMapping("/health")
    public String health(){
        System.out.println("Status: OK");
        return "Status: OK";
    }
}
