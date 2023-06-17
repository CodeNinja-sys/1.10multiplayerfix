/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.c;

import java.util.Date;
import java.util.Map;
import org.apache.logging.log4j.core.a.a.b;
import org.apache.logging.log4j.core.a.a.c.e;
import org.apache.logging.log4j.core.a.a.c.g;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.f;

public final class c
extends b {
    private static final org.apache.logging.log4j.core.a.a.c.f c = new org.apache.logging.log4j.core.a.a.c.f(null);
    private final org.apache.logging.log4j.core.a.a.c.h d;
    private org.apache.logging.log4j.core.a.a.c.b e;

    private c(String string, int n2, org.apache.logging.log4j.core.a.a.c.h h2) {
        super(string, n2);
        this.d = h2;
    }

    @Override
    protected void f() {
        this.e = this.d.a();
    }

    @Override
    protected void h() {
        if (this.e != null && !this.e.b()) {
            this.e.close();
        }
    }

    @Override
    protected void a(h h2) {
        Object object;
        Object object2;
        Object object3;
        if (!this.j() || this.e == null || this.e.b()) {
            throw new d("Cannot write logging event; NoSQL manager not connected to the database.");
        }
        g g2 = this.e.a();
        g2.a("level", (Object)h2.a());
        g2.a("loggerName", h2.b());
        g2.a("message", h2.d() == null ? null : h2.d().a());
        StackTraceElement stackTraceElement = h2.c();
        if (stackTraceElement == null) {
            g2.a("source", (Object)null);
        } else {
            g2.a("source", this.a(stackTraceElement));
        }
        f f2 = h2.e();
        if (f2 == null) {
            g2.a("marker", (Object)null);
        } else {
            object2 = object3 = this.e.a();
            object2.a("name", f2.a());
            while (f2.b() != null) {
                f2 = f2.b();
                object = this.e.a();
                object.a("name", f2.a());
                object2.a("parent", (g)object);
                object2 = object;
            }
            g2.a("marker", (g)object3);
        }
        g2.a("threadName", h2.f());
        g2.a("millis", h2.g());
        g2.a("date", new Date(h2.g()));
        object3 = h2.h();
        if (object3 == null) {
            g2.a("thrown", (Object)null);
        } else {
            object = object2 = this.e.a();
            object.a("type", object3.getClass().getName());
            object.a("message", ((Throwable)object3).getMessage());
            object.a("stackTrace", this.a(((Throwable)object3).getStackTrace()));
            while (((Throwable)object3).getCause() != null) {
                object3 = ((Throwable)object3).getCause();
                g g3 = this.e.a();
                g3.a("type", object3.getClass().getName());
                g3.a("message", ((Throwable)object3).getMessage());
                g3.a("stackTrace", this.a(((Throwable)object3).getStackTrace()));
                object.a("cause", g3);
                object = g3;
            }
            g2.a("thrown", (g)object2);
        }
        object2 = h2.i();
        if (object2 == null) {
            g2.a("contextMap", (Object)null);
        } else {
            object = this.e.a();
            for (Map.Entry entry : object2.entrySet()) {
                object.a((String)entry.getKey(), entry.getValue());
            }
            g2.a("contextMap", (g)object);
        }
        object = h2.j();
        if (object == null) {
            g2.a("contextStack", (Object)null);
        } else {
            g2.a("contextStack", object.d().toArray());
        }
        this.e.a(g2);
    }

    private g[] a(StackTraceElement[] arrstackTraceElement) {
        g[] arrg = this.e.a(arrstackTraceElement.length);
        for (int i2 = 0; i2 < arrstackTraceElement.length; ++i2) {
            arrg[i2] = this.a(arrstackTraceElement[i2]);
        }
        return arrg;
    }

    private g a(StackTraceElement stackTraceElement) {
        g g2 = this.e.a();
        g2.a("className", stackTraceElement.getClassName());
        g2.a("methodName", stackTraceElement.getMethodName());
        g2.a("fileName", stackTraceElement.getFileName());
        g2.a("lineNumber", stackTraceElement.getLineNumber());
        return g2;
    }

    public static c a(String string, int n2, org.apache.logging.log4j.core.a.a.c.h h2) {
        return (c)org.apache.logging.log4j.core.a.a.b.a(string, new e(n2, h2), c);
    }

    /* synthetic */ c(String string, int n2, org.apache.logging.log4j.core.a.a.c.h h2, org.apache.logging.log4j.core.a.a.c.d d2) {
        this(string, n2, h2);
    }
}

