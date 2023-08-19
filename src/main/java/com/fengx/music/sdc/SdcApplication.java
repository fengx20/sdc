package com.fengx.music.sdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：
 *
 * @author fengx
 **/
@SpringBootApplication
// @EnableTransactionManagement  //开启事务管理
public class SdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdcApplication.class, args);
    }

}
