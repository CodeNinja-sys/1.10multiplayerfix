/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.ServletContext
 *  javax.servlet.UnavailableException
 */
package org.apache.logging.log4j.core.k;

import java.net.URI;
import javax.servlet.ServletContext;
import javax.servlet.UnavailableException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.c.g;
import org.apache.logging.log4j.core.e.a;
import org.apache.logging.log4j.core.h.n;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.core.k.d;
import org.apache.logging.log4j.core.m;

final class e
implements d {
    private static final Object e = new Object();
    private final n f = new n(new org.apache.logging.log4j.core.h.d());
    private final ServletContext g;
    private String h;
    private org.apache.logging.log4j.core.j.g i;
    private k j;
    private boolean k = false;
    private boolean l = false;

    private e(ServletContext servletContext) {
        this.g = servletContext;
    }

    @Override
    public synchronized void a() {
        if (this.l) {
            throw new IllegalStateException("Cannot initialize Log4jWebInitializer after it was destroyed.");
        }
        if (!this.k) {
            this.k = true;
            this.h = this.f.a(this.g.getInitParameter("log4jContextName"));
            String string = this.f.a(this.g.getInitParameter("log4jConfiguration"));
            boolean bl2 = "true".equals(this.g.getInitParameter("isLog4jContextSelectorNamed"));
            if (bl2) {
                this.a(string);
            } else {
                this.b(string);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string) {
        URI uRI = null;
        if (string != null) {
            try {
                uRI = new URI(string);
            }
            catch (Exception exception) {
                this.g.log("Unable to convert configuration location [" + string + "] to a URI!", (Throwable)exception);
            }
        }
        if (this.h == null) {
            throw new UnavailableException("A log4jContextName context parameter is required");
        }
        g g2 = c.b();
        if (!(g2 instanceof org.apache.logging.log4j.core.e.c)) {
            this.g.log("Potential problem: Factory is not an instance of Log4jContextFactory.");
            return;
        }
        org.apache.logging.log4j.core.j.e e2 = ((org.apache.logging.log4j.core.e.c)g2).a();
        if (!(e2 instanceof org.apache.logging.log4j.core.j.g)) {
            this.g.log("Potential problem: Selector is not an instance of NamedContextSelector.");
            return;
        }
        this.i = (org.apache.logging.log4j.core.j.g)e2;
        k k2 = this.i.a(this.h, (Object)this.g, uRI);
        a.a.set(k2);
        if (k2.b() == m.a) {
            k2.e();
        }
        a.a.remove();
        this.j = k2;
        this.g.log("Created logger context for [" + this.h + "] using [" + k2.getClass().getClassLoader() + "].");
    }

    private void b(String string) {
        if (this.h == null) {
            this.h = this.g.getServletContextName();
        }
        if (this.h == null && string == null) {
            this.g.log("No Log4j context configuration provided. This is very unusual.");
            return;
        }
        this.j = org.apache.logging.log4j.core.config.m.a(this.h, this.e(), string, (Object)this.g);
    }

    @Override
    public synchronized void b() {
        if (!this.k) {
            throw new IllegalStateException("Cannot deinitialize Log4jWebInitializer because it has not initialized.");
        }
        if (!this.l) {
            this.l = true;
            if (this.j != null) {
                this.g.log("Removing LoggerContext for [" + this.h + "].");
                if (this.i != null) {
                    this.i.a(this.h);
                }
                this.j.f();
                this.j.a((Object)null);
                this.j = null;
            }
        }
    }

    @Override
    public void c() {
        if (this.j != null) {
            a.a.set(this.j);
        }
    }

    @Override
    public void d() {
        a.a.remove();
    }

    private ClassLoader e() {
        try {
            return this.g.getClassLoader();
        }
        catch (Throwable throwable) {
            return e.class.getClassLoader();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static d a(ServletContext servletContext) {
        Object object = e;
        synchronized (object) {
            d d2 = (d)servletContext.getAttribute(d);
            if (d2 == null) {
                d2 = new e(servletContext);
                servletContext.setAttribute(d, (Object)d2);
            }
            return d2;
        }
    }

    static {
        try {
            Class.forName("org.apache.logging.log4j.core.web.JNDIContextFilter");
            throw new IllegalStateException("You are using Log4j 2 in a web application with the old, extinct log4j-web artifact. This is not supported and could cause serious runtime problems. Pleaseremove the log4j-web JAR file from your application.");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }
}

