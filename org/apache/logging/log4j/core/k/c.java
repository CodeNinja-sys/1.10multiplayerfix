/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.Filter
 *  javax.servlet.FilterChain
 *  javax.servlet.FilterConfig
 *  javax.servlet.ServletContext
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 */
package org.apache.logging.log4j.core.k;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.logging.log4j.core.k.d;
import org.apache.logging.log4j.core.k.e;

public class c
implements Filter {
    static final String a = c.class.getName() + ".FILTERED";
    private ServletContext b;
    private d c;

    public void a(FilterConfig filterConfig) {
        this.b = filterConfig.getServletContext();
        this.b.log("Log4jServletFilter initialized.");
        this.c = e.a(this.b);
        this.c.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        if (servletRequest.getAttribute(a) != null) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletRequest.setAttribute(a, (Object)true);
            try {
                this.c.c();
                filterChain.doFilter(servletRequest, servletResponse);
            }
            finally {
                this.c.d();
            }
        }
    }

    public void a() {
        if (this.b == null || this.c == null) {
            throw new IllegalStateException("Filter destroyed before it was initialized.");
        }
        this.b.log("Log4jServletFilter destroyed.");
        this.c.c();
    }
}

