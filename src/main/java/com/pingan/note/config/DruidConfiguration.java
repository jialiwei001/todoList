package com.pingan.note.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.config
 * @ClassName: DruidConfiguration
 * @Description:
 * @date: 2019/11/28 18:24
 */
@Configuration
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean   statViewServlet(){

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        servletRegistrationBean.addInitParameter("allow","127.0.0.1");

        servletRegistrationBean.addInitParameter("deny","192.168.0.19");

        servletRegistrationBean.addInitParameter("loginUsername","druid");

        servletRegistrationBean.addInitParameter("loginPassword","123456");

        servletRegistrationBean.addInitParameter("resetEnable","false");

        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean  statFilter(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        filterRegistrationBean.addUrlPatterns("/*");

        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;
    }

}
