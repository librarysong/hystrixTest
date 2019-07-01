package cn.swf.demo.hystrix.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 宋维飞
 * 2019/7/1 10:07
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/index")
    public String index() {
        log.info("进入controller");
        return "ok!";
    }
}
