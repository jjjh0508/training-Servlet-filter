package com.jihwan.huchamjal;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class EncodingFilter implements Filter {
    private String encodingType;

    public EncodingFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type");
        System.out.println("encoding 초기화 : " + encodingType);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest) request;
        System.out.println(hrequest.getMethod());

        if ("POST".equals(hrequest.getMethod())) {
            request.setCharacterEncoding(encodingType);
            System.out.println("됐나?");

        }
        chain.doFilter(request, response);
    }
}
