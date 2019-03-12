package cn.ok.demos.nacosconfigdemo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "demo", autoRefreshed = true)
public class NacosConfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigDemoApplication.class, args);
    }

}
