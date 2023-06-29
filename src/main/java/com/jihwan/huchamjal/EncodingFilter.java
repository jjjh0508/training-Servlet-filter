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
        System.out.println("encoding 초기화");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest) request;
        if ("post".equals(hrequest.getMethod())) {
            request.setCharacterEncoding(encodingType);

        }
        chain.doFilter(request,response);
    }
}
