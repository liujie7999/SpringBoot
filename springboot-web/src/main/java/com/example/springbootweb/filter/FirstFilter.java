package com.example.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author liujie
 * @Date 2020/4/22 0:02
 * @Describe    创建FirstFilter方式一
 */

// @WebFilter(filterName = "FirstFilter" ,urlPatterns = {"*.do","*.jsp"})
@WebFilter(filterName = "FirstFilter" ,urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入First Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开First Filter");
    }

    @Override
    public void destroy() {

    }
}
