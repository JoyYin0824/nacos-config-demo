package cn.ok.demos.nacosconfigdemo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cn.ok.demos.nacosconfigdemo.controller
 *
 * @author kyou on 2019-03-12 19:31
 */
@RestController
public class DemoController {

    @NacosValue(value = "${name1:123}", autoRefreshed = true)
    private String name;

    @GetMapping("/demo")
    String getName() {
        return name;
    }
}
