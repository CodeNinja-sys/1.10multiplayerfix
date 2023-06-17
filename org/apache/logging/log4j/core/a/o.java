/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.e;

public final class o
extends a {
    private static final int a = 60;
    private final String b;
    private final String[] c;
    private final org.apache.logging.log4j.core.config.d d;
    private org.apache.logging.log4j.core.config.a e;
    private final List f = new ArrayList();
    private final long g;
    private long i = 0L;
    private volatile boolean j = false;

    private o(String string, d d2, String string2, String[] arrstring, int n2, org.apache.logging.log4j.core.config.d d3, boolean bl2) {
        super(string, d2, null, bl2);
        this.b = string2;
        this.c = arrstring;
        this.d = d3;
        this.g = n2;
    }

    @Override
    public void e() {
        Map map = this.d.k();
        int n2 = 0;
        if (map.containsKey(this.b)) {
            this.e = new org.apache.logging.log4j.core.config.a((b)map.get(this.b), null, null);
        } else {
            h.b("Unable to locate primary Appender " + this.b);
            ++n2;
        }
        for (String string : this.c) {
            if (map.containsKey(string)) {
                this.f.add(new org.apache.logging.log4j.core.config.a((b)map.get(string), null, null));
                continue;
            }
            h.b("Failover appender " + string + " is not configured");
        }
        if (this.f.size() == 0) {
            h.b("No failover appenders are available");
            ++n2;
        }
        if (n2 == 0) {
            super.e();
        }
    }

    @Override
    public void a(h h2) {
        if (!this.g()) {
            this.b("FailoverAppender " + this.a() + " did not start successfully");
            return;
        }
        if (!this.j) {
            this.c(h2);
        } else {
            long l2 = System.currentTimeMillis();
            if (l2 >= this.i) {
                this.c(h2);
            } else {
                this.a(h2, null);
            }
        }
    }

    private void c(h h2) {
        try {
            this.e.a(h2);
        }
        catch (Exception exception) {
            this.i = System.currentTimeMillis() + this.g;
            this.j = true;
            this.a(h2, exception);
        }
    }

    private void a(h h2, Exception exception) {
        e e2 = exception != null ? (exception instanceof e ? (e)exception : new e(exception)) : null;
        boolean bl2 = false;
        Exception exception2 = null;
        for (org.apache.logging.log4j.core.config.a a2 : this.f) {
            try {
                a2.a(h2);
                bl2 = true;
                break;
            }
            catch (Exception exception3) {
                if (exception2 != null) continue;
                exception2 = exception3;
            }
        }
        if (!bl2 && !this.c()) {
            if (e2 != null) {
                throw e2;
            }
            throw new e("Unable to write to failover appenders", exception2);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.a());
        stringBuilder.append(" primary=").append(this.e).append(", failover={");
        boolean bl2 = true;
        for (String string : this.c) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
            bl2 = false;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static o a(String string, String string2, String[] arrstring, String string3, org.apache.logging.log4j.core.config.d d2, d d3, String string4) {
        int n2;
        if (string == null) {
            h.b("A name for the Appender must be specified");
            return null;
        }
        if (string2 == null) {
            h.b("A primary Appender must be specified");
            return null;
        }
        if (arrstring == null || arrstring.length == 0) {
            h.b("At least one failover Appender must be specified");
            return null;
        }
        int n3 = o.a(string3, 60);
        if (n3 >= 0) {
            n2 = n3 * 1000;
        } else {
            h.f("Interval " + string3 + " is less than zero. Using default");
            n2 = 60000;
        }
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string4, true);
        return new o(string, d3, string2, arrstring, n2, d2, bl2);
    }
}

