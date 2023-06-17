/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.apache.commons.d.a;

public class b
implements Serializable,
a {
    private static final long d = -8649807923527610591L;
    protected transient Logger a = null;
    protected String b = null;
    private String e = "unknown";
    private String f = "unknown";
    private boolean g = false;
    protected static final Level c = Level.FINE;

    public b(String string) {
        this.b = string;
        this.a = this.g();
    }

    private void a(Level level, String string, Throwable throwable) {
        if (this.g().isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, string);
            if (!this.g) {
                this.h();
            }
            logRecord.setSourceClassName(this.e);
            logRecord.setSourceMethodName(this.f);
            if (throwable != null) {
                logRecord.setThrown(throwable);
            }
            this.g().log(logRecord);
        }
    }

    private void h() {
        try {
            Throwable throwable = new Throwable();
            throwable.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            String string = stringWriter.getBuffer().toString();
            StringTokenizer stringTokenizer = new StringTokenizer(string, "\n");
            stringTokenizer.nextToken();
            String string2 = stringTokenizer.nextToken();
            while (string2.indexOf(this.getClass().getName()) == -1) {
                string2 = stringTokenizer.nextToken();
            }
            while (string2.indexOf(this.getClass().getName()) >= 0) {
                string2 = stringTokenizer.nextToken();
            }
            int n2 = string2.indexOf("at ") + 3;
            int n3 = string2.indexOf(40);
            String string3 = string2.substring(n2, n3);
            int n4 = string3.lastIndexOf(46);
            this.e = string3.substring(0, n4);
            this.f = string3.substring(n4 + 1);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.g = true;
    }

    public void b(Object object) {
        this.a(Level.FINE, String.valueOf(object), null);
    }

    public void b(Object object, Throwable throwable) {
        this.a(Level.FINE, String.valueOf(object), throwable);
    }

    public void e(Object object) {
        this.a(Level.SEVERE, String.valueOf(object), null);
    }

    public void e(Object object, Throwable throwable) {
        this.a(Level.SEVERE, String.valueOf(object), throwable);
    }

    public void f(Object object) {
        this.a(Level.SEVERE, String.valueOf(object), null);
    }

    public void f(Object object, Throwable throwable) {
        this.a(Level.SEVERE, String.valueOf(object), throwable);
    }

    public Logger g() {
        if (this.a == null) {
            this.a = Logger.getLogger(this.b);
        }
        return this.a;
    }

    public void c(Object object) {
        this.a(Level.INFO, String.valueOf(object), null);
    }

    public void c(Object object, Throwable throwable) {
        this.a(Level.INFO, String.valueOf(object), throwable);
    }

    public boolean a() {
        return this.g().isLoggable(Level.FINE);
    }

    public boolean b() {
        return this.g().isLoggable(Level.SEVERE);
    }

    public boolean c() {
        return this.g().isLoggable(Level.SEVERE);
    }

    public boolean d() {
        return this.g().isLoggable(Level.INFO);
    }

    public boolean e() {
        return this.g().isLoggable(Level.FINEST);
    }

    public boolean f() {
        return this.g().isLoggable(Level.WARNING);
    }

    public void a(Object object) {
        this.a(Level.FINEST, String.valueOf(object), null);
    }

    public void a(Object object, Throwable throwable) {
        this.a(Level.FINEST, String.valueOf(object), throwable);
    }

    public void d(Object object) {
        this.a(Level.WARNING, String.valueOf(object), null);
    }

    public void d(Object object, Throwable throwable) {
        this.a(Level.WARNING, String.valueOf(object), throwable);
    }
}

