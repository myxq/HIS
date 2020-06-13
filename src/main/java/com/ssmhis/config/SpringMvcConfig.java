package com.ssmhis.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * @author 李永庆
 * @since 2019/8/25
 */
@Configuration
@ComponentScan(basePackages = {"com.ssmhis.controller"})
public class SpringMvcConfig {

    // 注册视图解析器
    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


}
