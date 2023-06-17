/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.d;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.a.m;

public class b
implements Serializable {
    private static final long a = -4341916115118014017L;
    private final long b = System.currentTimeMillis();
    private final StackTraceElement c;
    private final org.apache.logging.log4j.b d;
    private final m e;
    private final Throwable f;

    public b(StackTraceElement stackTraceElement, org.apache.logging.log4j.b b2, m m2, Throwable throwable) {
        this.c = stackTraceElement;
        this.d = b2;
        this.e = m2;
        this.f = throwable;
    }

    public long a() {
        return this.b;
    }

    public StackTraceElement b() {
        return this.c;
    }

    public org.apache.logging.log4j.b c() {
        return this.d;
    }

    public m d() {
        return this.e;
    }

    public Throwable e() {
        return this.f;
    }

    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        stringBuilder.append(simpleDateFormat.format(new Date(this.b)));
        stringBuilder.append(" ");
        stringBuilder.append(this.d.toString());
        stringBuilder.append(" ");
        stringBuilder.append(this.e.a());
        Object[] arrobject = this.e.c();
        Throwable throwable = this.f == null && arrobject != null && arrobject[arrobject.length - 1] instanceof Throwable ? (Throwable)arrobject[arrobject.length - 1] : this.f;
        if (throwable != null) {
            stringBuilder.append(" ");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            throwable.printStackTrace(new PrintStream(byteArrayOutputStream));
            stringBuilder.append(byteArrayOutputStream.toString());
        }
        return stringBuilder.toString();
    }
}

