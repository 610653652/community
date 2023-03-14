package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @program: community
 * @description: Test
 * @author: Mr.Ricardo
 * @create: 2023-03-12 16:15
 **/
@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy--MM-dd HH:mm:ss");
    }
}
