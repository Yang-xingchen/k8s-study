package k8s.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://supplier", name = "supplier")
public interface Service {

    @GetMapping("/supplier")
    String supplier();

}
