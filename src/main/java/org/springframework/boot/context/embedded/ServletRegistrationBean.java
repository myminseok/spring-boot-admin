package org.springframework.boot.context.embedded;

import javax.servlet.Servlet;

//https://github.com/spring-projects/spring-boot/issues/8186
public class ServletRegistrationBean extends org.springframework.boot.web.servlet.ServletRegistrationBean {

    public ServletRegistrationBean(Servlet servlet, String... urlMappings){
        super(servlet, urlMappings);
    }
}
