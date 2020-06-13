package com.ssmhis.app;

import com.ssmhis.config.AppConfig;
import com.ssmhis.filter.MyFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author 李永庆
 * @since 2019/8/25
 */
public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

/*    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new MyFilter()};
    }*/
}
