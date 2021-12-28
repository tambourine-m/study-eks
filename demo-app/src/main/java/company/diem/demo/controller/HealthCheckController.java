package company.diem.demo.controller;

import company.diem.demo.vo.HealthVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("health")
public class HealthCheckController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public HealthVO getHealthCheck() {
        log.info("GET HealthCheck API Called.");
        HealthVO healthVO = new HealthVO();
        healthVO.setStatus("OK");
        return healthVO;
    }
}
