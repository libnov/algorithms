package com.xmashu.algorithms.filter;

import com.xmashu.algorithms.utils.StringUtils;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: wei.hu
 * @CreateDate: 2019/7/22
 */

@WebFilter(urlPatterns = "/*", filterName = "LogFilter")
public class LogFilter implements Filter {

    private static final String TRACE_KEY = "traceId";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.put(TRACE_KEY, StringUtils.getUUID());
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }finally {
            MDC.remove(TRACE_KEY);
        }
    }

}
