package me.test.first.spring.rs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpMethod;
import org.springframework.util.Assert;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CacheControlInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    private String defaultCacheControl = "private, max-age=0";

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

        int status = response.getStatus();
        if (request.getMethod().equalsIgnoreCase(HttpMethod.GET.name())
                && status >= 200 && status < 300
                //&& status != 206
                && StringUtils.isBlank(response.getHeader("Cache-Control"))) {
            response.setHeader("Cache-Control", defaultCacheControl);
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

    public String getDefaultCacheControl() {
        return defaultCacheControl;
    }

    public void setDefaultCacheControl(String defaultCacheControl) {
        Assert.notNull(defaultCacheControl, "defaultCacheControl can not be null");
        this.defaultCacheControl = defaultCacheControl;
    }



}
