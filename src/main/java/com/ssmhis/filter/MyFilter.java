package com.ssmhis.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 李永庆
 * @since 2019/9/16
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();

        if (session.getAttribute("LOGIN_USER")==null && !request.getRequestURI().contains("/views/login.jsp")){
            response.sendRedirect("/views/login.jsp");
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }
}
