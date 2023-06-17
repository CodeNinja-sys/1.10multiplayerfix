/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.a;
import io.netty.util.c.b.e;
import io.netty.util.c.b.m;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class i
extends a {
    private static final long d = -1767272577989225979L;
    final transient Logger a;
    static final String b = i.class.getName();
    static final String c = a.class.getName();

    i(Logger logger) {
        super(logger.getName());
        this.a = logger;
    }

    @Override
    public boolean c() {
        return this.a.isLoggable(Level.FINEST);
    }

    @Override
    public void a(String string) {
        if (this.a.isLoggable(Level.FINEST)) {
            this.a(b, Level.FINEST, string, null);
        }
    }

    @Override
    public void a(String string, Object object) {
        if (this.a.isLoggable(Level.FINEST)) {
            e e2 = m.a(string, object);
            this.a(b, Level.FINEST, e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object object, Object object2) {
        if (this.a.isLoggable(Level.FINEST)) {
            e e2 = m.a(string, object, object2);
            this.a(b, Level.FINEST, e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object ... arrobject) {
        if (this.a.isLoggable(Level.FINEST)) {
            e e2 = m.a(string, arrobject);
            this.a(b, Level.FINEST, e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Throwable throwable) {
        if (this.a.isLoggable(Level.FINEST)) {
            this.a(b, Level.FINEST, string, throwable);
        }
    }

    @Override
    public boolean d() {
        return this.a.isLoggable(Level.FINE);
    }

    @Override
    public void b(String string) {
        if (this.a.isLoggable(Level.FINE)) {
            this.a(b, Level.FINE, string, null);
        }
    }

    @Override
    public void b(String string, Object object) {
        if (this.a.isLoggable(Level.FINE)) {
            e e2 = m.a(string, object);
            this.a(b, Level.FINE, e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object object, Object object2) {
        if (this.a.isLoggable(Level.FINE)) {
            e e2 = m.a(string, object, object2);
            this.a(b, Level.FINE, e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object ... arrobject) {
        if (this.a.isLoggable(Level.FINE)) {
            e e2 = m.a(string, arrobject);
            this.a(b, Level.FINE, e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Throwable throwable) {
        if (this.a.isLoggable(Level.FINE)) {
            this.a(b, Level.FINE, string, throwable);
        }
    }

    @Override
    public boolean e() {
        return this.a.isLoggable(Level.INFO);
    }

    @Override
    public void c(String string) {
        if (this.a.isLoggable(Level.INFO)) {
            this.a(b, Level.INFO, string, null);
        }
    }

    @Override
    public void c(String string, Object object) {
        if (this.a.isLoggable(Level.INFO)) {
            e e2 = m.a(string, object);
            this.a(b, Level.INFO, e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object object, Object object2) {
        if (this.a.isLoggable(Level.INFO)) {
            e e2 = m.a(string, object, object2);
            this.a(b, Level.INFO, e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object ... arrobject) {
        if (this.a.isLoggable(Level.INFO)) {
            e e2 = m.a(string, arrobject);
            this.a(b, Level.INFO, e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Throwable throwable) {
        if (this.a.isLoggable(Level.INFO)) {
            this.a(b, Level.INFO, string, throwable);
        }
    }

    @Override
    public boolean f() {
        return this.a.isLoggable(Level.WARNING);
    }

    @Override
    public void d(String string) {
        if (this.a.isLoggable(Level.WARNING)) {
            this.a(b, Level.WARNING, string, null);
        }
    }

    @Override
    public void d(String string, Object object) {
        if (this.a.isLoggable(Level.WARNING)) {
            e e2 = m.a(string, object);
            this.a(b, Level.WARNING, e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object object, Object object2) {
        if (this.a.isLoggable(Level.WARNING)) {
            e e2 = m.a(string, object, object2);
            this.a(b, Level.WARNING, e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object ... arrobject) {
        if (this.a.isLoggable(Level.WARNING)) {
            e e2 = m.a(string, arrobject);
            this.a(b, Level.WARNING, e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Throwable throwable) {
        if (this.a.isLoggable(Level.WARNING)) {
            this.a(b, Level.WARNING, string, throwable);
        }
    }

    @Override
    public boolean g() {
        return this.a.isLoggable(Level.SEVERE);
    }

    @Override
    public void e(String string) {
        if (this.a.isLoggable(Level.SEVERE)) {
            this.a(b, Level.SEVERE, string, null);
        }
    }

    @Override
    public void e(String string, Object object) {
        if (this.a.isLoggable(Level.SEVERE)) {
            e e2 = m.a(string, object);
            this.a(b, Level.SEVERE, e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object object, Object object2) {
        if (this.a.isLoggable(Level.SEVERE)) {
            e e2 = m.a(string, object, object2);
            this.a(b, Level.SEVERE, e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object ... arrobject) {
        if (this.a.isLoggable(Level.SEVERE)) {
            e e2 = m.a(string, arrobject);
            this.a(b, Level.SEVERE, e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Throwable throwable) {
        if (this.a.isLoggable(Level.SEVERE)) {
            this.a(b, Level.SEVERE, string, throwable);
        }
    }

    private void a(String string, Level level, String string2, Throwable throwable) {
        LogRecord logRecord = new LogRecord(level, string2);
        logRecord.setLoggerName(this.a());
        logRecord.setThrown(throwable);
        i.a(string, logRecord);
        this.a.log(logRecord);
    }

    private static void a(String string, LogRecord logRecord) {
        int n2;
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        int n3 = -1;
        for (n2 = 0; n2 < arrstackTraceElement.length; ++n2) {
            String string2 = arrstackTraceElement[n2].getClassName();
            if (!string2.equals(string) && !string2.equals(c)) continue;
            n3 = n2;
            break;
        }
        n2 = -1;
        for (int i2 = n3 + 1; i2 < arrstackTraceElement.length; ++i2) {
            String string3 = arrstackTraceElement[i2].getClassName();
            if (string3.equals(string) || string3.equals(c)) continue;
            n2 = i2;
            break;
        }
        if (n2 != -1) {
            StackTraceElement stackTraceElement = arrstackTraceElement[n2];
            logRecord.setSourceClassName(stackTraceElement.getClassName());
            logRecord.setSourceMethodName(stackTraceElement.getMethodName());
        }
    }
}

