package com.frico.crmcommon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@WebFilter(urlPatterns = "/*",filterName = "shiroLoginFilter")
public class ShiroLoginFilter implements Filter {

    private FilterConfig config = null;
    @Override
    public void init(FilterConfig config){
        this.config = config;
    }
    @Override
    public void destroy() {
        this.config = null;
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // 允许哪些Origin发起跨域请求,nginx下正常
        // response.setHeader( "Access-Control-Allow-Origin", config.getInitParameter( "AccessControlAllowOrigin" ) );
        response.setHeader( "Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader( "Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,PUT" );
        response.setHeader( "Access-Control-Max-Age", "3600" );// 多少秒内，不需要再发送预检验请求，可以缓存该结果
//        response.setHeader( "Access-Control-Allow-Headers", "x-auth-token,Origin,Access-Token,X-Requested-With,Content-Type, Accept" );// 表明它允许跨域请求包含xxx头
        response.setHeader("Access-Control-Allow-Headers",request.getHeader("Access-Control-Request-Headers"));
        response.setHeader( "Access-Control-Allow-Credentials", "true" );
        if (request.getMethod().equals( "OPTIONS" )) {
            response.setStatus( 200 );
            return;
        }
        StringBuffer path = request.getRequestURL();
        log.info("请求地址：{}",path);
        filterChain.doFilter( servletRequest, response );
    }

}
