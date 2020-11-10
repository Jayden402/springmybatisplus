package com.cxp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 将bean加入容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 这里可以配置需要加入容器的bean，同样可以声明配置类，然后加Bean
        return new Class[]{MvcConfig.class,MybatisPlusConfig.class};
    }

    //这个也是相当于将Bean加入容器
    //相当于springmvc容器
    //url映射配置，返回spring的配置文件
    //这里WebConfig主要是配置DispatcherSerlvet,视频解析器，JSON等
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //拦截请求匹配，只拦截
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
