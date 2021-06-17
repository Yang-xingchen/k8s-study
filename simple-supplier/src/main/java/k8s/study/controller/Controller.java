package k8s.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/supplier")
    public String supplier() {
        return "supplier";
    }

}
