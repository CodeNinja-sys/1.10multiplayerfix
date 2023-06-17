/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.ServletContext
 *  javax.servlet.ServletContextEvent
 *  javax.servlet.ServletContextListener
 *  javax.servlet.UnavailableException
 */
package org.apache.logging.log4j.core.k;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.UnavailableException;
import org.apache.logging.log4j.core.k.d;
import org.apache.logging.log4j.core.k.e;

public class b
implements ServletContextListener {
    private ServletContext a;
    private d b;

    public void a(ServletContextEvent servletContextEvent) {
        this.a = servletContextEvent.getServletContext();
        this.a.log("Log4jServletContextListener ensuring that Log4j starts up properly.");
        this.b = e.a(this.a);
        try {
            this.b.a();
            this.b.c();
        }
        catch (UnavailableException unavailableException) {
            throw new RuntimeException("Failed to initialize Log4j properly.", unavailableException);
        }
    }

    public void b(ServletContextEvent servletContextEvent) {
        if (this.a == null || this.b == null) {
            throw new IllegalStateException("Context destroyed before it was initialized.");
        }
        this.a.log("Log4jServletContextListener ensuring that Log4j shuts down properly.");
        this.b.d();
        this.b.b();
    }
}

