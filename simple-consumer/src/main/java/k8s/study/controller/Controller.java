package k8s.study.controller;

import k8s.study.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/consumer")
    public String consumer() {
        return "consumer";
    }

    @GetMapping("/supplier")
    public String supplier() {
        return "consumer's " + service.supplier();
    }

}
