package company.diem.demo.controller;

import company.diem.demo.vo.DemoAppVO;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoAppController {
    @RequestMapping("/")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoAppVO getName() {
        log.info("GET Name API Called");
        DemoAppVO demoAppVO = new DemoAppVO();
        demoAppVO.setName("DemoAPP");
        demoAppVO.setDistributor("tambourine-man");
        return demoAppVO;
    }
}
